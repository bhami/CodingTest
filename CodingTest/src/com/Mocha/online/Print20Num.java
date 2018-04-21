package com.Mocha.online;

public class Print20Num {
	
	public static void main(String[] args){
		for(int i =1; i<=20; i++){
			if((i%3 == 0) && (i% 5 != 0))
				System.out.println("usb");
			else if((i%5 == 0) && (i%3 != 0))
				System.out.println("device");
			else if((i%3 == 0) && (i%5 == 0))
				System.out.println("usbdevice");
			else
				System.out.println(i);
		}
	}
}
