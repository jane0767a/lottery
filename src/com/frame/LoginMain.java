package com.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.awt.EventQueue;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginMain extends JFrame {
	private JPanel contentPane;// 内容面板

	public static void main(String[] args) {
		try {
			// 设置登陆窗体风格
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// 实例化登录窗体
					LoginMain frame = new LoginMain();
					// 使登陆窗体可见
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginMain() {// 登陆窗体的构造方法
		setTitle("明日彩票预测系统");// 登陆窗体的标题
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginMain.class.getResource("/imgs/log.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 对登陆窗体发起"close"时，退了应用程序
		setBounds(200, 100, 1100, 620);// 登陆窗体的位置及宽高
		contentPane = new JPanel();// 内容面板
		setContentPane(contentPane);// 将内容面板放入登录窗体中
		contentPane.setLayout(new BorderLayout(0, 0));// 设置内容面板的布局为边界布局
		JButton btnNewButton = new JButton("");// 实例化无文本内容的按钮
		// 设置按钮的图片
		btnNewButton.setIcon(new ImageIcon(LoginMain.class.getResource("/imgs/login1.jpg")));
		contentPane.add(btnNewButton, BorderLayout.CENTER);// 按钮放置在内容面板的中间
		
		btnNewButton.addActionListener(new ActionListener() {//为按钮添加动作事件的监听
			public void actionPerformed(ActionEvent e){//动作事件的监听的方法体
				do_btnNewButton_actionPerformed(e);//按钮触发动作事件的监听时执行的方法
				
			}
			
			
		});
	
	
	
	}
	//按钮触发动作事件的监听时执行的方法
	protected void do_btnNewButton_actionPerformed(ActionEvent e){
		this.setVisible(false);//登陆窗体不可见
		MainFrame t=new MainFrame();//创建主窗体
		t.setVisible(true);//使主窗体可见
	}



}
