package ar.com.patterns.creational.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class SingletonMain {

	
	public static void main(String[] args) throws IOException {

		var orderMngntServiceOne = OrderMngntService.getInstance();
		var orderMngntServiceTwo = OrderMngntService.getInstance();

		System.out.println(orderMngntServiceOne == orderMngntServiceTwo);
		orderMngntServiceOne.placeOrder();
	}
}
