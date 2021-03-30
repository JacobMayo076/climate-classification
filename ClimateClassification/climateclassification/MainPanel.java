package climateclassification;

import java.util.ArrayList;

import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainPanel extends JPanel
{
	private Precipitation test = new Precipitation();
	private ArrayList<JTextField> dataTest;
	
	//private ArrayList<Precipitation> precip;
	private Precipitation[] precip = new Precipitation[12];
	private Temperature[] temper = new Temperature[12];
	private final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	private JTextField[] data = new JTextField[12];
	private Climate climate;
	private JTextField janTextField;
	private JTextField febTextField;
	private JTextField aprTextField;
	private JTextField marTextField;
	private JTextField mayTextField;
	private JTextField juneTextField;
	private JTextField julyTextField;
	private JTextField augTextField;
	private JTextField septTextField;
	private JTextField octTextField;
	private JTextField novTextField;
	private JTextField decTextField;
	private JLabel lblJuly;
	private JLabel lblAugust;
	private JLabel lblSeptember;
	private JLabel lblOctober;
	private JLabel lblNovember;
	private JLabel lblDecember;
	private JLabel lblPromptP;
	private JLabel lblPromptT;
	
	public MainPanel() 
	{
		//data = new JTextField[12];
		setBackground(SystemColor.activeCaption);
		setPreferredSize(new Dimension(750, 500));
		setLayout(null);
		
		janTextField = new JTextField();
		janTextField.setText("650.0");
		janTextField.setBounds(105, 82, 96, 20);
		janTextField.setColumns(10);
		add(janTextField);
		data[0] = janTextField;
		
		febTextField = new JTextField();
		febTextField.setText("10.0");
		febTextField.setColumns(10);
		febTextField.setBounds(105, 113, 96, 20);
		add(febTextField);
		data[1] = febTextField;
		
		aprTextField = new JTextField();
		aprTextField.setText("69.0");
		aprTextField.setColumns(10);
		aprTextField.setBounds(105, 175, 96, 20);
		add(aprTextField);
		data[3] = aprTextField;
		
		marTextField = new JTextField();
		marTextField.setText("104.0");
		marTextField.setColumns(10);
		marTextField.setBounds(105, 144, 96, 20);
		add(marTextField);
		data[2] = marTextField;
		
		mayTextField = new JTextField();
		mayTextField.setText("32.0");
		mayTextField.setColumns(10);
		mayTextField.setBounds(105, 206, 96, 20);
		add(mayTextField);
		data[4] = mayTextField;
		
		juneTextField = new JTextField();
		juneTextField.setText("443.0");
		juneTextField.setColumns(10);
		juneTextField.setBounds(105, 237, 96, 20);
		add(juneTextField);
		data[5] = juneTextField;
		
		julyTextField = new JTextField();
		julyTextField.setText("147.0");
		julyTextField.setColumns(10);
		julyTextField.setBounds(288, 82, 96, 20);
		add(julyTextField);
		data[6] = julyTextField;
		
		augTextField = new JTextField();
		augTextField.setText("76.0");
		augTextField.setColumns(10);
		augTextField.setBounds(288, 113, 96, 20);
		add(augTextField);
		data[7] = augTextField;
		
		septTextField = new JTextField();
		septTextField.setText("320.0");
		septTextField.setColumns(10);
		septTextField.setBounds(288, 144, 96, 20);
		add(septTextField);
		data[8] = septTextField;
		
		octTextField = new JTextField();
		octTextField.setText("97.0");
		octTextField.setColumns(10);
		octTextField.setBounds(288, 175, 96, 20);
		add(octTextField);
		data[9] = octTextField;
		
		novTextField = new JTextField();
		novTextField.setText("300.0");
		novTextField.setColumns(10);
		novTextField.setBounds(288, 206, 96, 20);
		add(novTextField);
		data[10] = novTextField;
		
		decTextField = new JTextField();
		decTextField.setText("420.69");
		decTextField.setColumns(10);
		decTextField.setBounds(288, 237, 96, 20);
		add(decTextField);
		data[11] = decTextField;
		
		JLabel lblJanuary = new JLabel("January");
		lblJanuary.setBounds(46, 85, 49, 14);
		add(lblJanuary);
		
		JLabel lblFebruary = new JLabel("February");
		lblFebruary.setBounds(46, 116, 49, 14);
		add(lblFebruary);
		
		JLabel lblMarch = new JLabel("March");
		lblMarch.setBounds(46, 144, 49, 14);
		add(lblMarch);
		
		JLabel lblApril = new JLabel("April");
		lblApril.setBounds(46, 175, 49, 14);
		add(lblApril);
		
		JLabel lblMay = new JLabel("May");
		lblMay.setBounds(46, 206, 49, 14);
		add(lblMay);
		
		JLabel lblJune = new JLabel("June");
		lblJune.setBounds(46, 237, 49, 14);
		add(lblJune);
		
		lblJuly = new JLabel("July");
		lblJuly.setBounds(229, 85, 49, 14);
		add(lblJuly);
		
		lblAugust = new JLabel("August");
		lblAugust.setBounds(229, 116, 49, 14);
		add(lblAugust);
		
		lblSeptember = new JLabel("September");
		lblSeptember.setBounds(229, 144, 55, 14);
		add(lblSeptember);
		
		lblOctober = new JLabel("October");
		lblOctober.setBounds(229, 175, 49, 14);
		add(lblOctober);
		
		lblNovember = new JLabel("November");
		lblNovember.setBounds(229, 206, 55, 14);
		add(lblNovember);
		
		lblDecember = new JLabel("December");
		lblDecember.setBounds(229, 237, 55, 14);
		add(lblDecember);
		
		JButton submitData = new JButton("Submit");
		submitData.setBounds(189, 268, 89, 23);
		submitData.addActionListener(new ButtonListener());
		add(submitData);
		
		lblPromptP = new JLabel("Enter Precipitation Data");
		lblPromptP.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromptP.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPromptP.setBounds(94, 25, 295, 33);
		lblPromptP.setVisible(true);
		add(lblPromptP);
		
		lblPromptT = new JLabel("Enter Temperature Data");
		lblPromptT.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromptT.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPromptT.setBounds(94, 25, 295, 33);
		lblPromptT.setVisible(false);
		add(lblPromptT);
		
	}
	
	private class ButtonListener implements ActionListener
	{
		private Precipitation tempPrecip = new Precipitation();
		private Temperature tempTemper = new Temperature();
		
		public void actionPerformed(ActionEvent e)
		{
			//Fix this
			if (e.getActionCommand().equals("Submit") && lblPromptP.isVisible() && !(lblPromptT.isVisible()))
			{
				for (int i = 0; i < 12; i++)
				{
					tempPrecip.setPrecip(Double.parseDouble(data[i].getText()));
					System.out.println("Data for " + months[i] + ": " + tempPrecip.toString());
					precip[i] = tempPrecip;
					lblPromptP.setVisible(false);
					lblPromptT.setVisible(true);
				}
			}
			else if (e.getActionCommand().equals("Submit") && lblPromptT.isVisible())
			{
				for (int i = 0; i < 12; i++)
				{
					tempTemper.setTemp(Double.parseDouble(data[i].getText()));
					System.out.println("Data for " + months[i] + ": " + tempTemper.toString());
					temper[i] = tempTemper;
					lblPromptT.setVisible(false);
				}
			}
			//climate.setYearlyPrecip(precip);
			//System.out.println(climate.toString());
		}
	}
}
