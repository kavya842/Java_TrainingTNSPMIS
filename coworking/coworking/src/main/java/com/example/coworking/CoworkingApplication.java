
package com.example.coworking;

import com.example.coworking.model.User;
import com.example.coworking.model.WorkSpace;
import com.example.coworking.model.Booking;

import com.example.coworking.service.UserService;
import com.example.coworking.service.WorkspaceService;
import com.example.coworking.service.BookingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.math.BigDecimal;

@SpringBootApplication
public class CoworkingApplication implements CommandLineRunner {

	private final UserService userService;
	private final WorkspaceService workspaceService;
	private final BookingService bookingService;

	public CoworkingApplication(
			UserService userService,
			WorkspaceService workspaceService,
			BookingService bookingService) {

		this.userService = userService;
		this.workspaceService = workspaceService;
		this.bookingService = bookingService;
	}

	public static void main(String[] args) {
		SpringApplication.run(CoworkingApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("\n========== COWORKING SPACE BOOKING ENGINE ==========");
			System.out.println("1. View Users");
			System.out.println("2. View Available Workspaces");
			System.out.println("3. Book Workspace");
			System.out.println("4. View My Bookings");
			System.out.println("5. Cancel Booking");
			System.out.println("6. View Revenue");
			System.out.println("7. Exit");

			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {

				// OPTION 1: VIEW USERS
				case 1:
					System.out.println("\n========== USERS LIST ==========");

					List<User> users = userService.getAllUsers();

					for (User user : users) {
						System.out.println("User ID: " + user.getUserId());
						System.out.println("Name: " + user.getFullName());
						System.out.println("Email: " + user.getEmail());
						System.out.println("Wallet Balance: ₹" + user.getWalletBalance());
						System.out.println("--------------------------------");
					}
					break;

				// OPTION 2: VIEW WORKSPACES
				case 2:
					System.out.println("\n========== AVAILABLE WORKSPACES ==========");

					List<WorkSpace> workspaces =
							workspaceService.getAllActiveWorkspaces();

					for (WorkSpace workspace : workspaces) {
						System.out.println("Workspace ID: " + workspace.getSpaceId());
						System.out.println("Name: " + workspace.getSpaceName());
						System.out.println("Type: " + workspace.getSpaceType());
						System.out.println("Hourly Rate: ₹" + workspace.getHourlyRate());
						System.out.println("--------------------------------");
					}
					break;

				// OPTION 3: BOOK WORKSPACE
				case 3:
					try {
						System.out.println("\n========== BOOK WORKSPACE ==========");

						System.out.print("Enter User ID: ");
						int userId = scanner.nextInt();

						System.out.print("Enter Workspace ID: ");
						int spaceId = scanner.nextInt();

						System.out.print("Enter Booking Date (yyyy-MM-dd): ");
						String dateInput = scanner.next();

						LocalDate bookingDate = LocalDate.parse(dateInput);

						System.out.print("Enter Slot Hour (0-23): ");
						int slotHour = scanner.nextInt();

						WorkSpace workspace =
								workspaceService.getWorkspaceById(spaceId);

						if (workspace == null) {
							System.out.println("Workspace not found!");
							break;
						}

						// BigDecimal correction
						BigDecimal hourlyRate = workspace.getHourlyRate();

						Booking booking = new Booking();

						booking.setUserId(userId);
						booking.setSpaceId(spaceId);
						booking.setBookingDate(bookingDate);
						booking.setSlotHour(slotHour);
						booking.setTotalCost(hourlyRate);
						booking.setBookingStatus("CONFIRMED");

						bookingService.bookWorkspace(booking);

						System.out.println("Booking successful!");
						System.out.println("Amount deducted: ₹" + hourlyRate);

					} catch (Exception e) {
						System.out.println("Booking failed: " + e.getMessage());
					}
					break;

				// OPTION 4: VIEW BOOKINGS
				case 4:
					System.out.println("\n========== MY BOOKINGS ==========");

					System.out.print("Enter User ID: ");
					int bookingUserId = scanner.nextInt();

					List<Booking> bookings =
							bookingService.getBookingsByUserId(bookingUserId);

					if (bookings.isEmpty()) {
						System.out.println("No bookings found.");
					} else {
						for (Booking booking : bookings) {
							System.out.println("Booking ID: " + booking.getBookingId());
							System.out.println("Workspace ID: " + booking.getSpaceId());
							System.out.println("Date: " + booking.getBookingDate());
							System.out.println("Slot Hour: " + booking.getSlotHour());
							System.out.println("Cost: ₹" + booking.getTotalCost());
							System.out.println("Status: " + booking.getBookingStatus());
							System.out.println("--------------------------------");
						}
					}
					break;

				// OPTION 5: CANCEL BOOKING
				case 5:
					try {
						System.out.println("\n========== CANCEL BOOKING ==========");

						System.out.print("Enter Booking ID: ");
						int bookingId = scanner.nextInt();

						bookingService.cancelBooking(bookingId);

						System.out.println("Booking cancelled successfully!");
						System.out.println("Wallet refund processed.");

					} catch (Exception e) {
						System.out.println("Cancellation failed: " + e.getMessage());
					}
					break;

				// OPTION 6: VIEW REVENUE
				case 6:
					System.out.println("\n========== TOTAL REVENUE ==========");

					BigDecimal revenue = bookingService.getTotalRevenue();

					System.out.println("Total Revenue: ₹" + revenue);
					break;

				// OPTION 7: EXIT
				case 7:
					System.out.println("\nThank you for using Coworking Space Booking Engine!");
					scanner.close();
					return;

				default:
					System.out.println("Invalid choice! Please enter 1-7.");
			}
		}
	}
}
