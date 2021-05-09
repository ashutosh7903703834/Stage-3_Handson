package com.cognizant.truyum.dao;

import java.text.SimpleDateFormat;

import java.util.*;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;


public class MenuItemDaoSqlImplTest {

	public static void main(String[] args) {
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
        testModifyMenuItem();
	}

	public static void testGetMenuItemListAdmin() {
		MenuItemDaoSqlImpl menuItemDao = null;
		try {
			menuItemDao = new MenuItemDaoSqlImpl();
			List<MenuItem> menuItems = new ArrayList <MenuItem>();
			menuItems = menuItemDao.getMenuItemListAdmin();
	        System.out.println("Menu item list for admin"); 
	        SimpleDateFormat simple = new SimpleDateFormat("dd/MM/YYYY");
	        System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));   
			for (MenuItem items : menuItems) {

				System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n",items.getName(),items.getPrice(),items.isActive(),simple.format(items.getDateOfLaunch()),items.getCategory(),items.isFreeDelivery()));

			}	
		} 
		catch (Exception e) 
		{
		
			e.printStackTrace();
		}
	}

	public static void testGetMenuItemListCustomer() {
		MenuItemDaoSqlImpl menuItemDao = null;

		try {

			menuItemDao = new MenuItemDaoSqlImpl();

			List<MenuItem> menuItems = new ArrayList<MenuItem>();

			menuItems = menuItemDao.getMenuItemListCustomer();

			System.out.println("Menu item list for customer"); 
			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/YYYY");

			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));

			for (MenuItem items : menuItems) {

				System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n",items.getName(),items.getPrice(),items.isActive(),simple.format(items.getDateOfLaunch()),items.getCategory(),items.isFreeDelivery()));


			}

		} 
		catch (Exception e) 
		{

		  e.printStackTrace();

		}
	}

	public static void testModifyMenuItem() {
		try {

			MenuItem menuItem = new MenuItem((long) 05,"Chocolate Brownie",(float)150.0, true, DateUtil.convertToDate("02/11/2022"),"Dessert",true);

			MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/YYYY");

			if(menuItemDao.getMenuItem(menuItem.getId()) == menuItem);

			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery")); 

			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n",menuItem.getName(),menuItem.getPrice(),menuItem.isActive(),simple.format(menuItem.getDateOfLaunch()),menuItem.getCategory(),menuItem.isFreeDelivery()));


			System.out.println("Modification Done");

		} 
		catch (Exception e)
		{

         e.printStackTrace();

		}
	}

	public static void testGetMenuItem() {

	}
}
