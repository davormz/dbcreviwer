package com.davo.dbcreviwer.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 * @author davo
 *
 */
public class GenericView extends JFrame implements ActionListener {
	
	private JDesktopPane jdpDesktop;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	private LoaderView loaderView;
	
	/**
	 * Serial version.
	 */
	private static final long serialVersionUID = -5994986638891702705L;

	/**
	 * Constructor
	 */
	public GenericView(){
		super("DBCR Reviwer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Make the main window positioned as "inset" pixels from each edge of the
		// screen.
		int inset = 150;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(inset, inset, screenSize.width - inset * 2, screenSize.height - inset * 2);
		
		// Create and Set up the GUI.
		jdpDesktop = new JDesktopPane();
		setJMenuBar(createMenuBar());
		
		// Make dragging faster by setting drag mode to Outline
		jdpDesktop.putClientProperty("JDesktopPane.dragMode", "outline");
		
		initViews();
		this.setVisible(true);
	}
	
	private void initViews(){
		loaderView = new LoaderView();
	}
	
	protected JMenuBar createMenuBar() {
		menuBar = new JMenuBar();
		menu = new JMenu("Document");
		menu.setMnemonic(KeyEvent.VK_N);
		menuItem = new JMenuItem("New");
		menuItem.setMnemonic(KeyEvent.VK_N);
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuBar.add(menu);
		return menuBar;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == menuItem){
			loaderView.setVisible(true);
			jdpDesktop.add(loaderView);
			try {
				loaderView.setSelected(true);
			} catch (PropertyVetoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
