package com.awt.day2;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {

	public static void main(String[] args) {
		Frame f = new Frame("Menu");
		
		MenuBar mBar = new MenuBar();
		Menu mFile = new Menu("File");
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
		
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator();
		mFile.add(miExit);
		
		MenuItem miPrint = new MenuItem("Print..");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup..");
		
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		CheckboxMenuItem cmiStatus 
			= new CheckboxMenuItem("Status bar", true);
		mView.add(cmiStatus);
		
		mBar.add(mFile);
		mBar.add(mEdit);
		mBar.add(mView);
		mBar.setHelpMenu(mHelp);
		
		f.setMenuBar(mBar);
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}
