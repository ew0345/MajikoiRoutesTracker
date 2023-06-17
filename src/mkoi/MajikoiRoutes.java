package mkoi;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Objects;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MajikoiRoutes extends JFrame {
	//private static final long serialVersionUID = 7201113623508556710L;

	final static long startTime = System.currentTimeMillis();
	
	static Boolean d = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(() -> {
			try {
				MajikoiRoutes frame = new MajikoiRoutes();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		final long endTime = System.currentTimeMillis();
		System.out.println("Time to Startup: "+(endTime-startTime)+"ms");
	}

	/**
	 * Create the frame.
	 */
	public MajikoiRoutes() throws IOException {
		// Build GUI
			setTitle("Majikoi Routes");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 800, 600);
			setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
			contentPane.setLayout(null);
	
			setContentPane(contentPane);
			
			
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 0, 774, 550);
			contentPane.add(tabbedPane);
	
		// MAJIKOI
		
			JPanel majikoi1 = new JPanel(false);
			majikoi1.setLayout(null);
			tabbedPane.addTab("Majikoi", majikoi1);
			
			JLabel m1MainRoutes = new JLabel("Main Routes");
			m1MainRoutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
			m1MainRoutes.setBounds(10, 11, 105, 31);
			majikoi1.add(m1MainRoutes);
			
			JCheckBox m1Momoyo = new JCheckBox("Momoyo");
			m1Momoyo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Momoyo.setBounds(10, 49, 105, 23);
			majikoi1.add(m1Momoyo);
			
			JCheckBox m1Chris = new JCheckBox("Chris");
			m1Chris.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Chris.setBounds(10, 75, 105, 23);
			majikoi1.add(m1Chris);
			
			JCheckBox m1Miyako = new JCheckBox("Miyako");
			m1Miyako.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Miyako.setBounds(10, 101, 105, 23);
			majikoi1.add(m1Miyako);
			
			JCheckBox m1Yukie = new JCheckBox("Yukie");
			m1Yukie.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Yukie.setBounds(10, 127, 105, 23);
			majikoi1.add(m1Yukie);
			
			JCheckBox m1Kazuko = new JCheckBox("Kazuko");
			m1Kazuko.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Kazuko.setBounds(10, 153, 105, 23);
			majikoi1.add(m1Kazuko);
			
			JLabel m1SubRoutes = new JLabel("Sub Routes");
			m1SubRoutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
			m1SubRoutes.setBounds(166, 11, 105, 31);
			majikoi1.add(m1SubRoutes);
			
			JCheckBox m1Kojima = new JCheckBox("Kojima-sensei");
			m1Kojima.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Kojima.setBounds(166, 49, 115, 23);
			majikoi1.add(m1Kojima);
			
			JCheckBox m1Chika = new JCheckBox("Chika");
			m1Chika.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Chika.setBounds(166, 75, 97, 23);
			majikoi1.add(m1Chika);
			
			JCheckBox m1Moro = new JCheckBox("Moro");
			m1Moro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Moro.setBounds(166, 101, 97, 23);
			majikoi1.add(m1Moro);
			
			JCheckBox m1Capt = new JCheckBox("Capt");
			m1Capt.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Capt.setBounds(166, 127, 97, 23);
			majikoi1.add(m1Capt);
			
			JCheckBox m1Gakuto = new JCheckBox("Gakuto");
			m1Gakuto.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Gakuto.setBounds(166, 153, 97, 23);
			majikoi1.add(m1Gakuto);
			
			JCheckBox m1HermitCrabs = new JCheckBox("Hermit Crabs");
			m1HermitCrabs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1HermitCrabs.setBounds(166, 179, 115, 23);
			majikoi1.add(m1HermitCrabs);
			
			JCheckBox m1NoRelationship = new JCheckBox("Future without Relationship");
			m1NoRelationship.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1NoRelationship.setBounds(166, 205, 199, 23);
			majikoi1.add(m1NoRelationship);
			
			JCheckBox m1Mayo = new JCheckBox("Mayo");
			m1Mayo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Mayo.setBounds(166, 231, 97, 23);
			majikoi1.add(m1Mayo);
			
			JLabel m1HiddneRoutes = new JLabel("Hidden Routes");
			m1HiddneRoutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
			m1HiddneRoutes.setBounds(334, 19, 115, 14);
			majikoi1.add(m1HiddneRoutes);
			
			JCheckBox m1TutorialRoom = new JCheckBox("Tutorial Room");
			m1TutorialRoom.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1TutorialRoom.setBounds(334, 49, 117, 23);
			majikoi1.add(m1TutorialRoom);
			
			JCheckBox m1Agave = new JCheckBox("Agave");
			m1Agave.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1Agave.setBounds(334, 75, 97, 23);
			majikoi1.add(m1Agave);
			
			JLabel m1AfterRoutes = new JLabel("After Routes");
			m1AfterRoutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
			m1AfterRoutes.setBounds(491, 19, 105, 14);
			majikoi1.add(m1AfterRoutes);
			
			JCheckBox m1MomoyoAfter = new JCheckBox("Momoyo After");
			m1MomoyoAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1MomoyoAfter.setBounds(491, 49, 119, 23);
			majikoi1.add(m1MomoyoAfter);
			
			JCheckBox m1MiyakoAfter = new JCheckBox("Miyako After");
			m1MiyakoAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1MiyakoAfter.setBounds(491, 75, 119, 23);
			majikoi1.add(m1MiyakoAfter);
			
			JCheckBox m1YukieAfter = new JCheckBox("Yukie After");
			m1YukieAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1YukieAfter.setBounds(491, 101, 97, 23);
			majikoi1.add(m1YukieAfter);
			
			JCheckBox m1KazukoAfter = new JCheckBox("Kazuko After");
			m1KazukoAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m1KazukoAfter.setBounds(491, 127, 119, 23);
			majikoi1.add(m1KazukoAfter);
			
		// MAJIKOI S

			JPanel majikoiS = new JPanel(false);
			majikoiS.setLayout(null);
			tabbedPane.addTab("Majikoi S", majikoiS);
			
			JLabel mSMainRoutes = new JLabel("Main Routes");
			mSMainRoutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
			mSMainRoutes.setBounds(10, 11, 105, 31);
			majikoiS.add(mSMainRoutes);
			
			JCheckBox mSCommon = new JCheckBox("2nd Year 1st Semester");
			mSCommon.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSCommon.setBounds(10, 49, 177, 23);
			majikoiS.add(mSCommon);
			
			JCheckBox mSMonshiro = new JCheckBox("Monshiro");
			mSMonshiro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSMonshiro.setBounds(10, 75, 97, 23);
			majikoiS.add(mSMonshiro);
			
			JCheckBox mSMonCont = new JCheckBox("Monshiro Continued");
			mSMonCont.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSMonCont.setBounds(10, 101, 153, 23);
			majikoiS.add(mSMonCont);
			
			JCheckBox mSMargit = new JCheckBox("Margit");
			mSMargit.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSMargit.setBounds(10, 127, 97, 23);
			majikoiS.add(mSMargit);
			
			JCheckBox mSMarCont = new JCheckBox("Margit Continued");
			mSMarCont.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSMarCont.setBounds(10, 153, 135, 23);
			majikoiS.add(mSMarCont);
			
			JCheckBox mSTsubame = new JCheckBox("Tsubame");
			mSTsubame.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSTsubame.setBounds(10, 179, 97, 23);
			majikoiS.add(mSTsubame);
			
			JCheckBox mSTsuCont1 = new JCheckBox("Future Where Tsubame Takes the Lead");
			mSTsuCont1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSTsuCont1.setBounds(10, 205, 289, 23);
			majikoiS.add(mSTsuCont1);
			
			JCheckBox mSTsuCont2 = new JCheckBox("Future Where Yamato Takes the Lead");
			mSTsuCont2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSTsuCont2.setBounds(10, 231, 289, 23);
			majikoiS.add(mSTsuCont2);
			
			JLabel mSSubRoutes = new JLabel("Sub Routes");
			mSSubRoutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
			mSSubRoutes.setBounds(405, 11, 105, 31);
			majikoiS.add(mSSubRoutes);
			
			JCheckBox mSIyo = new JCheckBox("Iyo");
			mSIyo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSIyo.setBounds(305, 49, 97, 23);
			majikoiS.add(mSIyo);
			
			JCheckBox mSShima = new JCheckBox("Future with Shima");
			mSShima.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSShima.setBounds(305, 152, 177, 23);
			majikoiS.add(mSShima);
			
			JCheckBox mSMaids = new JCheckBox("Future with the Maids");
			mSMaids.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSMaids.setBounds(305, 178, 187, 23);
			majikoiS.add(mSMaids);
			
			JCheckBox mSKazamaFam = new JCheckBox("Future with the Kazama Family");
			mSKazamaFam.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSKazamaFam.setBounds(500, 74, 257, 23);
			majikoiS.add(mSKazamaFam);
			
			JCheckBox mSTatsuko = new JCheckBox("Tatsuko");
			mSTatsuko.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSTatsuko.setBounds(305, 74, 97, 23);
			majikoiS.add(mSTatsuko);
			
			JCheckBox mSYumiko = new JCheckBox("Yumiko");
			mSYumiko.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSYumiko.setBounds(305, 100, 97, 23);
			majikoiS.add(mSYumiko);
			
			JCheckBox mSDevotedCrabs = new JCheckBox("Future Devoted to Hermit Crabs");
			mSDevotedCrabs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSDevotedCrabs.setBounds(500, 100, 263, 23);
			majikoiS.add(mSDevotedCrabs);
			
			JCheckBox mSFMiyako1 = new JCheckBox("Another Futre with Miyako 1");
			mSFMiyako1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSFMiyako1.setBounds(500, 126, 235, 23);
			majikoiS.add(mSFMiyako1);
			
			JCheckBox mSFMiyako2 = new JCheckBox("Another Future with Miyako 2");
			mSFMiyako2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSFMiyako2.setBounds(500, 152, 263, 23);
			majikoiS.add(mSFMiyako2);
			
			JCheckBox mSFMiyako3 = new JCheckBox("Another Future with Miyako 3");
			mSFMiyako3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSFMiyako3.setBounds(500, 178, 245, 23);
			majikoiS.add(mSFMiyako3);
			
			JCheckBox mSChousokabe = new JCheckBox("Future with Chousokabe");
			mSChousokabe.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSChousokabe.setBounds(305, 204, 205, 23);
			majikoiS.add(mSChousokabe);
			
			JCheckBox mSKokoro = new JCheckBox("Kokoro");
			mSKokoro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSKokoro.setBounds(305, 126, 97, 23);
			majikoiS.add(mSKokoro);
			
			JCheckBox mSNoRelationship = new JCheckBox("Future without a Relationship");
			mSNoRelationship.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSNoRelationship.setBounds(500, 48, 245, 23);
			majikoiS.add(mSNoRelationship);
			
			JLabel mSHiddenRoutes = new JLabel("Hidden Routes");
			mSHiddenRoutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
			mSHiddenRoutes.setBounds(10, 261, 108, 14);
			majikoiS.add(mSHiddenRoutes);
			
			JCheckBox mSKosugi = new JCheckBox("Kosugi");
			mSKosugi.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSKosugi.setBounds(10, 299, 97, 23);
			majikoiS.add(mSKosugi);
			
			JCheckBox mSKosugiCont = new JCheckBox("Future with Kosugi Continued");
			mSKosugiCont.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSKosugiCont.setBounds(10, 325, 213, 23);
			majikoiS.add(mSKosugiCont);
			
			JCheckBox mSChildhood = new JCheckBox("Childhood");
			mSChildhood.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSChildhood.setBounds(10, 351, 97, 23);
			majikoiS.add(mSChildhood);
			
			JCheckBox mSKoyuki = new JCheckBox("Koyuki");
			mSKoyuki.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSKoyuki.setBounds(10, 377, 97, 23);
			majikoiS.add(mSKoyuki);
			
			JCheckBox mSFKoyuki = new JCheckBox("Future with Koyuki");
			mSFKoyuki.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSFKoyuki.setBounds(10, 403, 145, 23);
			majikoiS.add(mSFKoyuki);
			
			JCheckBox mSAcqTakae = new JCheckBox("Future Where You're An Acquaintance of Takae");
			mSAcqTakae.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSAcqTakae.setBounds(10, 429, 339, 23);
			majikoiS.add(mSAcqTakae);
			
			JLabel mSAfterRoutes = new JLabel("After Routes");
			mSAfterRoutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
			mSAfterRoutes.setBounds(385, 261, 97, 14);
			majikoiS.add(mSAfterRoutes);
			
			JCheckBox mSMonshiroAfter = new JCheckBox("Monshiro After");
			mSMonshiroAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSMonshiroAfter.setBounds(385, 301, 121, 23);
			majikoiS.add(mSMonshiroAfter);
			
			JCheckBox mSKazukoAfter = new JCheckBox("Kazuko S After");
			mSKazukoAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSKazukoAfter.setBounds(385, 327, 125, 23);
			majikoiS.add(mSKazukoAfter);
			
			JCheckBox mSMomoyoAfter = new JCheckBox("Momoyo S After");
			mSMomoyoAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSMomoyoAfter.setBounds(385, 353, 135, 23);
			majikoiS.add(mSMomoyoAfter);
			
			JCheckBox mSMiyakoAfter = new JCheckBox("Miyako S After");
			mSMiyakoAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSMiyakoAfter.setBounds(385, 379, 121, 23);
			majikoiS.add(mSMiyakoAfter);
			
			JCheckBox mSYukieAfter = new JCheckBox("Yukie S After");
			mSYukieAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSYukieAfter.setBounds(385, 405, 111, 23);
			majikoiS.add(mSYukieAfter);
			
			JCheckBox mSChrisAfter = new JCheckBox("Chris After + S After");
			mSChrisAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSChrisAfter.setBounds(522, 299, 161, 23);
			majikoiS.add(mSChrisAfter);
			
			JCheckBox mSTsuCont1After = new JCheckBox("Future with Tsubame 1 After");
			mSTsuCont1After.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSTsuCont1After.setBounds(522, 351, 235, 23);
			majikoiS.add(mSTsuCont1After);
			
			JCheckBox mSTsuCont2After = new JCheckBox("Future with Tsubame 2 After");
			mSTsuCont2After.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSTsuCont2After.setBounds(522, 377, 235, 23);
			majikoiS.add(mSTsuCont2After);
			
			JCheckBox mSHermitCrabsAfter = new JCheckBox("Future with Hermit Crabs S After");
			mSHermitCrabsAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSHermitCrabsAfter.setBounds(522, 403, 237, 23);
			majikoiS.add(mSHermitCrabsAfter);
			
			JCheckBox mSAgaveAfter = new JCheckBox("Agave After");
			mSAgaveAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mSAgaveAfter.setBounds(522, 325, 105, 23);
			majikoiS.add(mSAgaveAfter);
		
		// MAJIKOI A-1
			
			JPanel majikoiA1 = new JPanel(false);
			majikoiA1.setLayout(null);
			tabbedPane.addTab("Majikoi A-1", majikoiA1);
			
			JLabel benki = new JLabel("Benki");
			benki.setBounds(10, 10, 47, 14);
			benki.setFont(new Font("Tahoma", Font.PLAIN, 17));
			majikoiA1.add(benki);
			
			JCheckBox mA1Benki = new JCheckBox("Completed");
			mA1Benki.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA1Benki.setBounds(8, 33, 97, 23);
			majikoiA1.add(mA1Benki);
			
			JLabel azumi = new JLabel("Azumi");
			azumi.setFont(new Font("Tahoma", Font.PLAIN, 17));
			azumi.setBounds(147, 10, 57, 14);
			majikoiA1.add(azumi);
			
			JCheckBox mA1Azumi = new JCheckBox("Completed");
			mA1Azumi.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA1Azumi.setBounds(147, 34, 97, 23);
			majikoiA1.add(mA1Azumi);
			
			JLabel sayaka = new JLabel("Sayaka");
			sayaka.setFont(new Font("Tahoma", Font.PLAIN, 17));
			sayaka.setBounds(270, 6, 57, 23);
			majikoiA1.add(sayaka);
			
			JCheckBox mA1Sayaka = new JCheckBox("Completed");
			mA1Sayaka.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA1Sayaka.setBounds(269, 34, 97, 23);
			majikoiA1.add(mA1Sayaka);
			
			
			
		
		// MAJIKOI A-2
			
			JPanel majikoiA2 = new JPanel(false);
			majikoiA2.setLayout(null);
			tabbedPane.addTab("Majikoi A-2", majikoiA2);
			
			JLabel monshiro = new JLabel("Monshiro");
			monshiro.setBounds(10, 10, 67, 14);
			monshiro.setFont(new Font("Tahoma", Font.PLAIN, 17));
			majikoiA2.add(monshiro);
			
			JCheckBox mA2Monshiro = new JCheckBox("Completed");
			mA2Monshiro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA2Monshiro.setBounds(8, 33, 97, 23);
			majikoiA2.add(mA2Monshiro);
			
			JLabel aiess = new JLabel("Aiess");
			aiess.setFont(new Font("Tahoma", Font.PLAIN, 17));
			aiess.setBounds(147, 10, 57, 14);
			majikoiA2.add(aiess);
			
			JCheckBox mA2Aiess = new JCheckBox("Completed");
			mA2Aiess.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA2Aiess.setBounds(147, 34, 97, 23);
			majikoiA2.add(mA2Aiess);
			
			JLabel seiso = new JLabel("Seiso");
			seiso.setFont(new Font("Tahoma", Font.PLAIN, 17));
			seiso.setBounds(269, 10, 57, 14);
			majikoiA2.add(seiso);
			
			JCheckBox mA2Seiso = new JCheckBox("Completed");
			mA2Seiso.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA2Seiso.setBounds(269, 34, 97, 23);
			majikoiA2.add(mA2Seiso);
			
		// MAJIKOI A-3
		
			JPanel majikoiA3 = new JPanel(false);
			majikoiA3.setLayout(null);
			tabbedPane.addTab("Majikoi A-3", majikoiA3);
			
			JLabel lee = new JLabel("Lee");
			lee.setBounds(10, 10, 47, 14);
			lee.setFont(new Font("Tahoma", Font.PLAIN, 17));
			majikoiA3.add(lee);
			
			JCheckBox mA3Lee = new JCheckBox("Completed");
			mA3Lee.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA3Lee.setBounds(8, 33, 97, 23);
			majikoiA3.add(mA3Lee);
			
			JLabel stacy = new JLabel("Stacy");
			stacy.setFont(new Font("Tahoma", Font.PLAIN, 17));
			stacy.setBounds(147, 6, 57, 23);
			majikoiA3.add(stacy);
			
			JCheckBox mA3Stacy = new JCheckBox("Completed");
			mA3Stacy.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA3Stacy.setBounds(147, 34, 97, 23);
			majikoiA3.add(mA3Stacy);
			
			JLabel tsubame = new JLabel("Tsubame");
			tsubame.setFont(new Font("Tahoma", Font.PLAIN, 17));
			tsubame.setBounds(269, 10, 68, 14);
			majikoiA3.add(tsubame);
			
			JCheckBox mA3Tsubame = new JCheckBox("Completed");
			mA3Tsubame.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA3Tsubame.setBounds(269, 34, 97, 23);
			majikoiA3.add(mA3Tsubame);
			
		// MAJIKOI A-4
			
			JPanel majikoiA4 = new JPanel(false);
			majikoiA4.setLayout(null);
			tabbedPane.addTab("Majikoi A-4", majikoiA4);
			
			JLabel lin = new JLabel("Lin");
			lin.setBounds(10, 10, 47, 14);
			lin.setFont(new Font("Tahoma", Font.PLAIN, 17));
			majikoiA4.add(lin);
			
			JCheckBox mA4Lin = new JCheckBox("Completed");
			mA4Lin.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA4Lin.setBounds(8, 33, 97, 23);
			majikoiA4.add(mA4Lin);
			
			JLabel homura = new JLabel("Homura");
			homura.setFont(new Font("Tahoma", Font.PLAIN, 17));
			homura.setBounds(147, 6, 97, 23);
			majikoiA4.add(homura);
			
			JCheckBox mA4Homura = new JCheckBox("Completed");
			mA4Homura.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA4Homura.setBounds(147, 34, 97, 23);
			majikoiA4.add(mA4Homura);
			
			
		
		// MAJIKOI A-5
			// TODO
			
			JPanel majikoiA5 = new JPanel(false);
			majikoiA5.setLayout(null);
			tabbedPane.addTab("Majikoi A-5", majikoiA5);

			JLabel yoshitsune = new JLabel("Yoshitsune");
			yoshitsune.setFont(new Font("Tahoma", Font.PLAIN, 17));
			yoshitsune.setBounds(10, 10, 97, 23);
			majikoiA5.add(yoshitsune);

			JCheckBox mA5Yoshitsune = new JCheckBox("Completed");
			mA5Yoshitsune.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA5Yoshitsune.setBounds(8, 33, 97, 23);
			majikoiA5.add(mA5Yoshitsune);

			JLabel takae = new JLabel("Takae");
			takae.setFont(new Font("Tahoma", Font.PLAIN, 17));
			takae.setBounds(147, 6, 97, 23);
			majikoiA5.add(takae);

			JCheckBox mA5Takae = new JCheckBox("Completed");
			mA5Takae.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA5Takae.setBounds(147, 34, 97, 23);
			majikoiA5.add(mA5Takae);

			JLabel margitAfter = new JLabel("Margit After");
			margitAfter.setFont(new Font("Tahoma", Font.PLAIN, 15));
			margitAfter.setBounds(269, 6, 97, 23);
			majikoiA5.add(margitAfter);

			JCheckBox mA5Margit = new JCheckBox("Completed");
			mA5Margit.setFont(new Font("Tahoma", Font.PLAIN, 15));
			mA5Margit.setBounds(269, 34, 97, 23);
			majikoiA5.add(mA5Margit);
		
		// About
			
			JPanel about = new JPanel(false);
			about.setLayout(null);
			tabbedPane.addTab("About", about);
			
			JLabel image = new JLabel(new ImageIcon(Objects.requireNonNull(MajikoiRoutes.class.getResource("/mkoi/Icon3.png"))));
			image.setText("Made by Ew0345");
			image.setFont(new Font("Tahoma", Font.PLAIN, 18));
			image.setBounds(249, 13, 248, 70);
			about.add(image);
			
			JLabel aboutGithub = new JLabel("Github: https://www.github.com/ew0345");
			aboutGithub.setHorizontalAlignment(SwingConstants.CENTER);
			aboutGithub.setFont(new Font("Tahoma", Font.PLAIN, 18));
			aboutGithub.setBounds(175, 77, 443, 47);
			about.add(aboutGithub);
			
			JLabel aboutInfo = new JLabel("This program creates a folder and several files in your user home folder");
			aboutInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			aboutInfo.setBounds(94, 269, 606, 41);
			about.add(aboutInfo);
			
			JLabel aboutInfo2 = new JLabel("The files are all contained within the folder \"MajikoiRoutes\", these can be safely deleted");
			aboutInfo2.setHorizontalAlignment(SwingConstants.CENTER);
			aboutInfo2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			aboutInfo2.setBounds(12, 302, 745, 41);
			about.add(aboutInfo2);
			
			JLabel aboutInfo3 = new JLabel("However deleting these files will reset the state of any checked boxes in the routes tabs.");
			aboutInfo3.setHorizontalAlignment(SwingConstants.CENTER);
			aboutInfo3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			aboutInfo3.setBounds(22, 334, 735, 32);
			about.add(aboutInfo3);
			
			JButton mDeleteData = new JButton("Delete Files");
			mDeleteData.setFont(new Font("Tahoma", Font.PLAIN, 30));
			mDeleteData.setBounds(22, 395, 735, 116);
			about.add(mDeleteData);
			
		// Persistence code for checkboxes
			// TODO:
			//  MAJIKOI A-4
			//  MAJIKOI A-5
			
			File fDir = new File(System.getProperty("user.home")+"/MajikoiRoutes");
			File m1State = new File(System.getProperty("user.home")+"/MajikoiRoutes/m1State.txt");
			File mSState = new File(System.getProperty("user.home")+"/MajikoiRoutes/mSState.txt");
			File mA1State = new File(System.getProperty("user.home")+"/MajikoiRoutes/mA1State.txt");
			File mA2State = new File(System.getProperty("user.home")+"/MajikoiRoutes/mA2State.txt");
			File mA3State = new File(System.getProperty("user.home")+"/MajikoiRoutes/mA3State.txt");
			File mA4State = new File(System.getProperty("user.home")+"/MajikoiRoutes/mA4State.txt");
			File mA5State = new File(System.getProperty("user.home")+"/MajikoiRoutes/mA5State.txt");
					
			fDir.mkdirs();
			
			// Read State file for MAJIKOI 1
	    	if (!m1State.exists()) {
	    		m1State.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(m1State));
				//System.out.println("M1");
				for (int i = 0; i < 19; i++) {
					//System.out.println(i);
					bw.write("0");
					bw.newLine();
				}
				bw.close();
	    	}
			List<String> m1StatesList = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader(m1State));
			String line = br.readLine();
			//System.out.println("M1");
			while (line != null) {
				m1StatesList.add(line);
				//System.out.println(line);
				line = br.readLine();
			}
			br.close();
			String[] m1States = m1StatesList.toArray(new String[0]);
			
			// Read State file for MAJIKOI S
			if (!mSState.exists()) {
				mSState.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(mSState));
				for (int i = 0; i < 37; i++) {
					bw.write("0");
					bw.newLine();
				}
				bw.close();
			}
			List<String> mSStatesList = new ArrayList<>();
			BufferedReader br1 = new BufferedReader(new FileReader(mSState));
			String line1 = br1.readLine();
			while (line1 != null) {
				mSStatesList.add(line1);
				line1 = br1.readLine();
			}
			br1.close();
			String[] mSStates = mSStatesList.toArray(new String[0]);
			
			// Read State file for MAJIKOI A-1
			if (!mA1State.exists()) {
	    		mA1State.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(mA1State));
				//System.out.println("M-A1");
				for (int i = 0; i < 3; i++) {
					//System.out.println(i);
					bw.write("0");
					bw.newLine();
				}
				bw.close();
	    	}
			
			List<String> mA1StatesList = new ArrayList<>();
			BufferedReader br2 = new BufferedReader(new FileReader(mA1State));
			String line2 = br2.readLine();
			//System.out.println("M-A1");
			while (line2 != null) {
				mA1StatesList.add(line2);
				//System.out.println(line2);
				line2 = br2.readLine();
			}
			br2.close();
			String[] mA1States = mA1StatesList.toArray(new String[0]);
			
			// Read State file for MAJIKOI A-2
			if (!mA2State.exists()) {
	    		mA2State.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(mA2State));
				//System.out.println("M-A2");
				for (int i = 0; i < 3; i++) {
					//System.out.println(i);
					bw.write("0");
					bw.newLine();
				}
				bw.close();
	    	}
			
			List<String> mA2StatesList = new ArrayList<>();
			BufferedReader br3 = new BufferedReader(new FileReader(mA2State));
			String line3 = br3.readLine();
			//System.out.println("M-A2");
			while (line3 != null) {
				mA2StatesList.add(line3);
				//System.out.println(line3);
				line3 = br3.readLine();
			}
			br3.close();
			String[] mA2States = mA2StatesList.toArray(new String[0]);
			
			// Read State file for MAJIKOI A-3
			if (!mA3State.exists()) {
	    		mA3State.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(mA3State));
				//System.out.println("M-A3");
				for (int i = 0; i < 3; i++) {
					//System.out.println(i);
					bw.write("0");
					bw.newLine();
				}
				bw.close();
	    	}
			
			List<String> mA3StatesList = new ArrayList<>();
			BufferedReader br4 = new BufferedReader(new FileReader(mA3State));
			String line4 = br4.readLine();
			//System.out.println("M-A3");
			while (line4 != null) {
				mA3StatesList.add(line4);
				//System.out.println(line4);
				line4 = br4.readLine();
			}
			br4.close();
			String[] mA3States = mA3StatesList.toArray(new String[0]);
			
			// Read State file for MAJIKOI A-4
			if (!mA4State.exists()) {
				mA4State.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(mA4State));
				//System.out.println("M-A4");
				for (int i = 0; i < 2; i++) {
					//System.out.println(i);
					bw.write("0");
					bw.newLine();
				}
				bw.close();
			}
			
			List<String> mA4StatesList = new ArrayList<>();
			BufferedReader br5 = new BufferedReader(new FileReader(mA4State));
			String line5 = br5.readLine();
			//System.out.println("M-A4");
			while (line5 != null) {
				mA4StatesList.add(line5);
				//System.out.println(line5);
				line5 = br5.readLine();
			}
			br5.close();
			String[] mA4States = mA4StatesList.toArray(new String[0]);

			// Read State File for MAJIKOI A-5
			if (!mA5State.exists()) {
				mA5State.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(mA5State));
				//System.out.println("M-A5");
				for (int i = 0; i < 3; i++) {
					//System.out.println(i);
					bw.write("0");
					bw.newLine();
				}
				bw.close();
			}

			List<String> mA5StatesList = new ArrayList<>();
			BufferedReader br6 = new BufferedReader(new FileReader(mA5State));
			String line6 = br6.readLine();
			//System.out.println("M-A5");
			while (line6 != null) {
				mA5StatesList.add(line6);
				//System.out.println(line6);
				line6 = br6.readLine();
			}
			br6.close();
			String[] mA5States = mA5StatesList.toArray(new String[0]);
			
			
			// MAJIKOI 1
			for (int i = 0; i < m1States.length; i++) {
				switch (i) {
					case 0:
						m1Momoyo.setSelected(!m1States[i].equals("0"));
						break;
					case 1:
						m1Chris.setSelected(!m1States[i].equals("0"));
						break;
					case 2:
						m1Miyako.setSelected(!m1States[i].equals("0"));
						break;
					case 3:
						m1Yukie.setSelected(!m1States[i].equals("0"));
						break;
					case 4:
						m1Kazuko.setSelected(!m1States[i].equals("0"));
						break;
					case 5:
						m1Kojima.setSelected(!m1States[i].equals("0"));
						break;
					case 6:
						m1Chika.setSelected(!m1States[i].equals("0"));
						break;
					case 7:
						m1Moro.setSelected(!m1States[i].equals("0"));
						break;
					case 8:
						m1Capt.setSelected(!m1States[i].equals("0"));
						break;
					case 9:
						m1Gakuto.setSelected(!m1States[i].equals("0"));
						break;
					case 10:
						m1HermitCrabs.setSelected(!m1States[i].equals("0"));
						break;
					case 11:
						m1NoRelationship.setSelected(!m1States[i].equals("0"));
						break;
					case 12:
						m1Mayo.setSelected(!m1States[i].equals("0"));
						break;
					case 13:
						m1TutorialRoom.setSelected(!m1States[i].equals("0"));
						break;
					case 14:
						m1Agave.setSelected(!m1States[i].equals("0"));
						break;
					case 15:
						m1MomoyoAfter.setSelected(!m1States[i].equals("0"));
						break;
					case 16:
						m1MiyakoAfter.setSelected(!m1States[i].equals("0"));
						break;
					case 17:
						m1YukieAfter.setSelected(!m1States[i].equals("0"));
						break;
					case 18:
						m1KazukoAfter.setSelected(!m1States[i].equals("0"));
						break;
					default:
						break;
				}
			}

			// MAJIKOI S
			for (int i1 = 0; i1 < mSStates.length; i1++) {
				switch (i1) {
				case 0:
					mSCommon.setSelected(!mSStates[i1].equals("0"));
					break;
				case 1:
					mSMonshiro.setSelected(!mSStates[i1].equals("0"));
					break;
				case 2:
					mSMonCont.setSelected(!mSStates[i1].equals("0"));
					break;
				case 3:
					mSMargit.setSelected(!mSStates[i1].equals("0"));
					break;
				case 4:
					mSMarCont.setSelected(!mSStates[i1].equals("0"));
					break;
				case 5:
					mSTsubame.setSelected(!mSStates[i1].equals("0"));
					break;
				case 6:
					mSTsuCont1.setSelected(!mSStates[i1].equals("0"));
					break;
				case 7:
					mSTsuCont2.setSelected(!mSStates[i1].equals("0"));
					break;
				case 8:
					mSIyo.setSelected(!mSStates[i1].equals("0"));
					break;
				case 9:
					mSShima.setSelected(!mSStates[i1].equals("0"));
					break;
				case 10:
					mSMaids.setSelected(!mSStates[i1].equals("0"));
					break;
				case 11:
					mSKazamaFam.setSelected(!mSStates[i1].equals("0"));
					break;
				case 12:
					mSTatsuko.setSelected(!mSStates[i1].equals("0"));
					break;
				case 13:
					mSYumiko.setSelected(!mSStates[i1].equals("0"));
					break;
				case 14:
					mSDevotedCrabs.setSelected(!mSStates[i1].equals("0"));
					break;
				case 15:
					mSFMiyako1.setSelected(!mSStates[i1].equals("0"));
					break;
				case 16:
					mSFMiyako2.setSelected(!mSStates[i1].equals("0"));
					break;
				case 17:
					mSFMiyako3.setSelected(!mSStates[i1].equals("0"));
					break;
				case 18:
					mSChousokabe.setSelected(!mSStates[i1].equals("0"));
					break;
				case 19:
					mSKokoro.setSelected(!mSStates[i1].equals("0"));
					break;
				case 20:
					mSNoRelationship.setSelected(!mSStates[i1].equals("0"));
					break;
				case 21:
					mSKosugi.setSelected(!mSStates[i1].equals("0"));
					break;
				case 22:
					mSKosugiCont.setSelected(!mSStates[i1].equals("0"));
					break;
				case 23:
					mSChildhood.setSelected(!mSStates[i1].equals("0"));
					break;
				case 24:
					mSKoyuki.setSelected(!mSStates[i1].equals("0"));
					break;
				case 25:
					mSFKoyuki.setSelected(!mSStates[i1].equals("0"));
					break;
				case 26:
					mSAcqTakae.setSelected(!mSStates[i1].equals("0"));
					break;
				case 27:
					mSMonshiroAfter.setSelected(!mSStates[i1].equals("0"));
					break;
				case 28:
					mSKazukoAfter.setSelected(!mSStates[i1].equals("0"));
					break;
				case 29:
					mSMomoyoAfter.setSelected(!mSStates[i1].equals("0"));
					break;
				case 30:
					mSMiyakoAfter.setSelected(!mSStates[i1].equals("0"));
					break;
				case 31:
					mSYukieAfter.setSelected(!mSStates[i1].equals("0"));
					break;
				case 32:
					mSChrisAfter.setSelected(!mSStates[i1].equals("0"));
					break;
				case 33:
					mSTsuCont1After.setSelected(!mSStates[i1].equals("0"));
					break;
				case 34:
					mSTsuCont2After.setSelected(!mSStates[i1].equals("0"));
					break;
				case 35:
					mSHermitCrabsAfter.setSelected(!mSStates[i1].equals("0"));
					break;
				case 36:
					mSAgaveAfter.setSelected(!mSStates[i1].equals("0"));
					break;
				default: break;
				}
			}

			// MAJIKOI A-1
			for (int i2 = 0; i2 < mA1States.length; i2++) {
				switch (i2) {
				case 0:
					mA1Benki.setSelected(!mA1States[i2].equals("0"));
					break;
				case 1:
					mA1Azumi.setSelected(!mA1States[i2].equals("0"));
					break;
				case 2:
					mA1Sayaka.setSelected(!mA1States[i2].equals("0"));
					break;
				default: break;
				}
			}

			// MAJIKOI A-2
			for (int i3 = 0; i3 < mA2States.length; i3++) {
				switch (i3) {
				case 0:
					mA2Monshiro.setSelected(!mA2States[i3].equals("0"));
					break;
				case 1:
					mA2Aiess.setSelected(!mA2States[i3].equals("0"));
					break;
				case 2:
					mA2Seiso.setSelected(!mA2States[i3].equals("0"));
					break;
				default: break;
				}
			}

			// MAJIKOI A-3
			for (int i4 = 0; i4 < mA3States.length; i4++) {
				switch (i4) {
				case 0:
					mA3Lee.setSelected(!mA3States[i4].equals("0"));
					break;
				case 1:
					mA3Stacy.setSelected(!mA3States[i4].equals("0"));
					break;
				case 2:
					mA3Tsubame.setSelected(!mA3States[i4].equals("0"));
					break;
				default: break;
				}
			}

			// MAJIKOI A-4
			for (int i5 = 0; i5 < mA4States.length; i5++) {
				switch(i5) {
				case 0:
					mA4Lin.setSelected(!mA4States[i5].equals("0"));
					break;
				case 1:
					mA4Homura.setSelected(!mA4States[i5].equals("0"));
					break;
				default: break;
				}
			}

			// MAJIKOI A-5
			for (int i6 = 0; i6 < mA5States.length; i6++) {
				switch(i6) {
					case 0:
						mA5Yoshitsune.setSelected(!mA5States[i6].equals("0"));
						break;
					case 1:
						mA5Takae.setSelected(!mA5States[i6].equals("0"));
						break;
					case 2:
						mA5Margit.setSelected(!mA5States[i6].equals("0"));
						break;
					default: break;
				}
			}
	
			addWindowListener(new java.awt.event.WindowAdapter() {
			    @Override
			    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
			    	if (m1States.length > 0) {
				    	if (m1Momoyo.isSelected()) {
							m1States[0] = "1";
						} else if (!m1Momoyo.isSelected()) {
							m1States[0] = "0";
						}
				    	
				    	if (m1Chris.isSelected()) {
							m1States[1] = "1";
						} else if (!m1Chris.isSelected()) {
							m1States[1] = "0";
						}
				    	
				    	if (m1Miyako.isSelected()) {
							m1States[2] = "1";
						} else if (!m1Miyako.isSelected()) {
							m1States[2] = "0";
						}
				    	
				    	if (m1Yukie.isSelected()) {
							m1States[3] = "1";
						} else if (!m1Yukie.isSelected()) {
							m1States[3] = "0";
						}
				    	
				    	if (m1Kazuko.isSelected()) {
							m1States[4] = "1";
						} else if (!m1Kazuko.isSelected()) {
							m1States[4] = "0";
						}
				    	
				    	if (m1Kojima.isSelected()) {
							m1States[5] = "1";
						} else if (!m1Kojima.isSelected()) {
							m1States[5] = "0";
						}
				    	
				    	if (m1Chika.isSelected()) {
							m1States[6] = "1";
						} else if (!m1Chika.isSelected()) {
							m1States[6] = "0";
						}

				    	if (m1Moro.isSelected()) {
							m1States[7] = "1";
						} else if (!m1Moro.isSelected()) {
							m1States[7] = "0";
						}
				    	
				    	if (m1Capt.isSelected()) {
							m1States[8] = "1";
						} else if (!m1Capt.isSelected()) {
							m1States[8] = "0";
						}
				    	
				    	if (m1Gakuto.isSelected()) {
							m1States[9] = "1";
						} else if (!m1Gakuto.isSelected()) {
							m1States[9] = "0";
						}
				    	
				    	if (m1HermitCrabs.isSelected()) {
							m1States[10] = "1";
						} else if (!m1HermitCrabs.isSelected()) {
							m1States[10] = "0";
						}
				    	
				    	if (m1NoRelationship.isSelected()) {
							m1States[11] = "1";
						} else if (!m1Moro.isSelected()) {
							m1States[11] = "0";
						}
				    	
				    	if (m1Mayo.isSelected()) {
							m1States[12] = "1";
						} else if (!m1Mayo.isSelected()) {
							m1States[12] = "0";
						}
				    	
				    	if (m1TutorialRoom.isSelected()) {
							m1States[13] = "1";
						} else if (!m1TutorialRoom.isSelected()) {
							m1States[13] = "0";
						}
				    	
				    	if (m1Agave.isSelected()) {
							m1States[14] = "1";
						} else if (!m1Agave.isSelected()) {
							m1States[14] = "0";
						}
				    	
				    	if (m1MomoyoAfter.isSelected()) {
							m1States[15] = "1";
						} else if (!m1MomoyoAfter.isSelected()) {
							m1States[15] = "0";
						}
				    	
				    	if (m1MiyakoAfter.isSelected()) {
							m1States[16] = "1";
						} else if (!m1MiyakoAfter.isSelected()) {
							m1States[16] = "0";
						}
				    	
				    	if (m1YukieAfter.isSelected()) {
							m1States[17] = "1";
						} else if (!m1YukieAfter.isSelected()) {
							m1States[17] = "0";
						}
				    	
				    	if (m1KazukoAfter.isSelected()) {
							m1States[18] = "1";
						} else if (!m1KazukoAfter.isSelected()) {
							m1States[18] = "0";
						}
				    	
				    	// Write m1States to State.txt
				        try {
				        	if (d) Arrays.fill(m1States, "0");
							BufferedWriter bw = new BufferedWriter(new FileWriter(m1State));
							//System.out.println("M1");
							for (String state : m1States) {
								//System.out.println(state);
								bw.write(state);
								bw.newLine();
							}
							bw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
			    	}
			    	
			    	// MAJIKOI S
			    	
			    	if (mSStates.length > 0) {
			    		if (mSCommon.isSelected()) {
			    			mSStates[0] = "1";
			    		} else if (!mSCommon.isSelected()) {
			    			mSStates[0] = "0";
			    		}
			    		
			    		if (mSMonshiro.isSelected()) {
			    			mSStates[1] = "1";
			    		} else if (!mSMonshiro.isSelected()) {
			    			mSStates[1] = "0";
			    		}
			    		
			    		if (mSMonCont.isSelected()) {
			    			mSStates[2] = "1";
			    		} else if (!mSMonCont.isSelected()) {
			    			mSStates[2] = "0";
			    		}
			    		
			    		if (mSMargit.isSelected()) {
			    			mSStates[3] = "1";
			    		} else if (!mSMargit.isSelected()) {
			    			mSStates[3] = "0";
			    		}
			    		
			    		if (mSMarCont.isSelected()) {
			    			mSStates[4] = "1";
			    		} else if (!mSMarCont.isSelected()) {
			    			mSStates[4] = "0";
			    		}
			    		
			    		if (mSTsubame.isSelected()) {
			    			mSStates[5] = "1";
			    		} else if (!mSTsubame.isSelected()) {
			    			mSStates[5] = "0";
			    		}
			    		
			    		if (mSTsuCont1.isSelected()) {
			    			mSStates[6] = "1";
			    		} else if (!mSTsuCont1.isSelected()) {
			    			mSStates[6] = "0";
			    		}
			    		
			    		if (mSTsuCont2.isSelected()) {
			    			mSStates[7] = "1";
			    		} else if (!mSTsuCont2.isSelected()) {
			    			mSStates[7] = "0";
			    		}
			    		
			    		if (mSIyo.isSelected()) {
			    			mSStates[8] = "1";
			    		} else if (!mSIyo.isSelected()) {
			    			mSStates[8] = "0";
			    		}
			    		
			    		if (mSShima.isSelected()) {
			    			mSStates[9] = "1";
			    		} else if (!mSShima.isSelected()) {
			    			mSStates[9] = "0";
			    		}

			    		if (mSMaids.isSelected()) {
			    			mSStates[10] = "1";
			    		} else if (!mSMaids.isSelected()) {
			    			mSStates[10] = "0";
			    		}
			    		
			    		if (mSKazamaFam.isSelected()) {
			    			mSStates[11] = "1";
			    		} else if (!mSKazamaFam.isSelected()) {
			    			mSStates[11] = "0";
			    		}
			    		
			    		if (mSTatsuko.isSelected()) {
			    			mSStates[12] = "1";
			    		} else if (!mSTatsuko.isSelected()) {
			    			mSStates[12] = "0";
			    		}
			    		
			    		if (mSYumiko.isSelected()) {
			    			mSStates[13] = "1";
			    		} else if (!mSYumiko.isSelected()) {
			    			mSStates[13] = "0";
			    		}
			    		
			    		if (mSDevotedCrabs.isSelected()) {
			    			mSStates[14] = "1";
			    		} else if (!mSDevotedCrabs.isSelected()) {
			    			mSStates[14] = "0";
			    		}
			    		
			    		if (mSFMiyako1.isSelected()) {
			    			mSStates[15] = "1";
			    		} else if (!mSFMiyako1.isSelected()) {
			    			mSStates[15] = "0";
			    		}
			    		
			    		if (mSFMiyako2.isSelected()) {
			    			mSStates[16] = "1";
			    		} else if (!mSFMiyako2.isSelected()) {
			    			mSStates[16] = "0";
			    		}
			    		
			    		if (mSFMiyako3.isSelected()) {
			    			mSStates[17] = "1";
			    		} else if (!mSFMiyako3.isSelected()) {
			    			mSStates[17] = "0";
			    		}
			    		
			    		if (mSChousokabe.isSelected()) {
			    			mSStates[18] = "1";
			    		} else if (!mSChousokabe.isSelected()) {
			    			mSStates[18] = "0";
			    		}
			    		
			    		if (mSKokoro.isSelected()) {
			    			mSStates[19] = "1";
			    		} else if (!mSKokoro.isSelected()) {
			    			mSStates[19] = "0";
			    		}
			    		
			    		if (mSNoRelationship.isSelected()) {
			    			mSStates[20] = "1";
			    		} else if (!mSNoRelationship.isSelected()) {
			    			mSStates[20] = "0";
			    		}
			    		
			    		if (mSKosugi.isSelected()) {
			    			mSStates[21] = "1";
			    		} else if (!mSKosugi.isSelected()) {
			    			mSStates[21] = "0";
			    		}
			    		
			    		if (mSKosugiCont.isSelected()) {
			    			mSStates[22] = "1";
			    		} else if (!mSKosugiCont.isSelected()) {
			    			mSStates[22] = "0";
			    		}
			    		
			    		if (mSChildhood.isSelected()) {
			    			mSStates[23] = "1";
			    		} else if (!mSChildhood.isSelected()) {
			    			mSStates[23] = "0";
			    		}
			    		
			    		if (mSKoyuki.isSelected()) {
			    			mSStates[24] = "1";
			    		} else if (!mSKoyuki.isSelected()) {
			    			mSStates[24] = "0";
			    		}
			    		
			    		if (mSFKoyuki.isSelected()) {
			    			mSStates[25] = "1";
			    		} else if (!mSFKoyuki.isSelected()) {
			    			mSStates[25] = "0";
			    		}
			    		
			    		if (mSAcqTakae.isSelected()) {
			    			mSStates[26] = "1";
			    		} else if (!mSAcqTakae.isSelected()) {
			    			mSStates[26] = "0";
			    		}
			    		
			    		if (mSMonshiroAfter.isSelected()) {
			    			mSStates[27] = "1";
			    		} else if (!mSMonshiroAfter.isSelected()) {
			    			mSStates[27] = "0";
			    		}
			    		
			    		if (mSKazukoAfter.isSelected()) {
			    			mSStates[28] = "1";
			    		} else if (!mSKazukoAfter.isSelected()) {
			    			mSStates[28] = "0";
			    		}
			    		
			    		if (mSMomoyoAfter.isSelected()) {
			    			mSStates[29] = "1";
			    		} else if (!mSMomoyoAfter.isSelected()) {
			    			mSStates[29] = "0";
			    		}
			    		
			    		if (mSMiyakoAfter.isSelected()) {
			    			mSStates[30] = "1";
			    		} else if (!mSMiyakoAfter.isSelected()) {
			    			mSStates[30] = "0";
			    		}
			    		
			    		if (mSYukieAfter.isSelected()) {
			    			mSStates[31] = "1";
			    		} else if (!mSYukieAfter.isSelected()) {
			    			mSStates[31] = "0";
			    		}
			    		
			    		if (mSChrisAfter.isSelected()) {
			    			mSStates[32] = "1";
			    		} else if (!mSChrisAfter.isSelected()) {
			    			mSStates[32] = "0";
			    		}
			    		
			    		if (mSTsuCont1After.isSelected()) {
			    			mSStates[33] = "1";
			    		} else if (!mSTsuCont1After.isSelected()) {
			    			mSStates[33] = "0";
			    		}
			    		if (mSHermitCrabsAfter.isSelected()) {
			    			mSStates[34] = "1";
			    		} else if (!mSHermitCrabsAfter.isSelected()) {
			    			mSStates[34] = "0";
			    		}
			    		
			    		if (mSAgaveAfter.isSelected()) {
			    			mSStates[35] = "1";
			    		} else if (!mSAgaveAfter.isSelected()) {
			    			mSStates[35] = "0";
			    		}
			    	}
			    	
			    	try {
			    		if (d) Arrays.fill(mSStates, "0");
			    		BufferedWriter bw = new BufferedWriter(new FileWriter(mSState));
						for (String sState : mSStates) {
							bw.write(sState);
							bw.newLine();
						}
			    		bw.close();
			    	} catch (Exception e) {
			    		e.printStackTrace();
			    	}
			    	
			    	// MAJIKOI A-1
			    	
			    	if (mA1States.length > 0) {
			    		if (mA1Benki.isSelected()) {
			    			mA1States[0] = "1";
			    		} else if (!mA1Benki.isSelected()) {
			    			mA1States[0] = "0";
			    		}
			    		
			    		if (mA1Azumi.isSelected()) {
			    			mA1States[1] = "1";
			    		} else if (!mA1Azumi.isSelected()) {
			    			mA1States[1] = "0";
			    		}
			    		
			    		if (mA1Sayaka.isSelected()) {
			    			mA1States[2] = "1";
			    		} else if (!mA1Sayaka.isSelected()) {
			    			mA1States[2] = "0";
			    		}
			    		
			    		try {
			    			if (d) Arrays.fill(mA1States, "0");
			    			BufferedWriter bw = new BufferedWriter(new FileWriter(mA1State));
			    			//System.out.println("M-A1");
							for (String a1State : mA1States) {
								//System.out.println(a1State);
								bw.write(a1State);
								bw.newLine();
							}
			    			bw.close();
			    		} catch (IOException e) {
			    			e.printStackTrace();
			    		}
			    	}
			    	
			    	// MAJIKOI A-2
			    	
			    	if (mA2States.length > 0) {
			    		if (mA2Monshiro.isSelected()) {
			    			mA2States[0] = "1";
			    		} else if (!mA2Monshiro.isSelected()) {
			    			mA2States[0] = "0";
			    		}
			    		
			    		if (mA2Aiess.isSelected()) {
			    			mA2States[1] = "1";
			    		} else if (!mA2Aiess.isSelected()) {
			    			mA2States[1] = "0";
			    		}
			    		
			    		if (mA2Seiso.isSelected()) {
			    			mA2States[2] = "1";
			    		} else if (!mA2Seiso.isSelected()) {
			    			mA2States[2] = "0";
			    		}
			    		
			    		try {
			    			if (d) Arrays.fill(mA2States, "0");
			    			BufferedWriter bw = new BufferedWriter(new FileWriter(mA2State));
			    			//System.out.println("M-A1");
							for (String a2State : mA2States) {
								//System.out.println(a2State);
								bw.write(a2State);
								bw.newLine();
							}
			    			bw.close();
			    		} catch (IOException e) {
			    			e.printStackTrace();
			    		}
			    	}
			    	
			    	// MAJIKOI A-3
			    	
					if (mA3States.length > 0) {
						if (mA3Lee.isSelected()) {
			    			mA3States[0] = "1";
			    		} else if (!mA3Lee.isSelected()) {
			    			mA3States[0] = "0";
			    		}
			    		
			    		if (mA3Stacy.isSelected()) {
			    			mA3States[1] = "1";
			    		} else if (!mA3Stacy.isSelected()) {
			    			mA3States[1] = "0";
			    		}
			    		
			    		if (mA3Tsubame.isSelected()) {
			    			mA3States[2] = "1";
			    		} else if (!mA3Tsubame.isSelected()) {
			    			mA3States[2] = "0";
			    		}
			    		
						try {
							if (d) Arrays.fill(mA3States, "0");
							BufferedWriter bw = new BufferedWriter(new FileWriter(mA3State));
							//System.out.println("M-A3");
							for (String a3State : mA3States) {
								//System.out.println(a3State);
								bw.write(a3State);
								bw.newLine();
							}
							bw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
					// MAJIKOI A-4
					if (mA4States.length > 0) {
						if (mA4Lin.isSelected()) {
							mA4States[0] = "1";
						} else if (!mA4Lin.isSelected()) {
							mA4States[0] = "0";
						}
						
						if (mA4Homura.isSelected()) {
							mA4States[1] = "1";
						} else if (!mA4Homura.isSelected()) {
							mA4States[1] = "0";
						}
					}

					try {
						if (d) Arrays.fill(mA4States, "0");
						BufferedWriter bw = new BufferedWriter(new FileWriter(mA4State));
						//System.out.println("M-A4");
						for (String a4State : mA4States) {
							//System.out.println(a4State);
							bw.write(a4State);
							bw.newLine();
						}
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

					// MAJIKOI A-5
					if (mA5States.length > 0) {
						if (mA5Yoshitsune.isSelected()) {
							mA5States[0] = "1";
						} else if (!mA5Yoshitsune.isSelected()) {
							mA5States[0] = "0";
						}

						if (mA5Takae.isSelected()) {
							mA5States[1] = "1";
						} else if (!mA5Takae.isSelected()) {
							mA5States[1] = "0";
						}

						if (mA5Margit.isSelected()) {
							mA5States[2] = "1";
						} else if (!mA5Margit.isSelected()) {
							mA5States[2] = "0";
						}
					}

					try {
						if (d) Arrays.fill(mA5States, "0");
						BufferedWriter bw = new BufferedWriter(new FileWriter(mA5State));
						for (String a5State : mA5States) {
							//System.out.println(a5State);
							bw.write(a5State);
							bw.newLine();
						}
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			    	
					
			        System.exit(0);
			    }
			});
			
			mDeleteData.addActionListener((ActionEvent e) -> {
				int q = JOptionPane.showConfirmDialog(this, "Delete files?\nThis will reset all checked boxes upon next open.", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (q == JOptionPane.YES_OPTION) {
					m1State.delete();
					mSState.delete();
					mA1State.delete();
					mA2State.delete();
					mA3State.delete();
					mA4State.delete();
					mA5State.delete();
					d = true;
				}
			});
	}
}
