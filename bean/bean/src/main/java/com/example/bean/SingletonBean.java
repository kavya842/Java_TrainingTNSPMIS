package com.example.bean;

/*
 * This is an empty Java class used to demonstrate singleton scope.
 *
 * The class itself does not make an object a singleton. The scope is
 * configured in ScopeConfiguration. There, Spring creates one object of
 * this class per application context and reuses it for later requests.
 */
public class SingletonBean {
}