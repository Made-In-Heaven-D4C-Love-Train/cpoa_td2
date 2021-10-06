package cpoa_td1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menus extends JFrame{
	
		   private JMenuBar barre = new JMenuBar();
		   
		   private JMenu p�riodicit� = new JMenu("P�riodicit�");
		   private JMenu revue = new JMenu("Revue");
<<<<<<< HEAD
		   private JMenu client = new JMenu("Client");
		   private JMenu abonnement = new JMenu("Abonnement");
		  
		   private JMenuItem ajout�e_p = new JMenuItem("ajouter");
		   private JMenuItem suprim�e_p = new JMenuItem("supprimer");
		   private JMenuItem modifi�e_p = new JMenuItem("modifier");
		   
		   private JMenuItem ajout�e_r = new JMenuItem("ajouter");
		   private JMenuItem suprim�e_r = new JMenuItem("supprimer");
		   private JMenuItem modifi�e_r = new JMenuItem("modifier");
		   
		   private JMenuItem ajout�e_c = new JMenuItem("ajouter");
		   private JMenuItem suprim�e_c = new JMenuItem("supprimer");
		   private JMenuItem modifi�e_c = new JMenuItem("modifier");
		   
		   private JMenuItem ajout�e_a = new JMenuItem("ajouter");
		   private JMenuItem suprim�e_a = new JMenuItem("supprimer");
		   private JMenuItem modifi�e_a = new JMenuItem("modifier");
		   
		   
		public Menus() {
		    super("menu gestionnaire");
		     setJMenuBar(barre);
		     barre.add(p�riodicit�);
		     barre.add(revue);
		     barre.add(client);
		     barre.add(abonnement);
		     p�riodicit�.add(ajout�e_p);
		     p�riodicit�.add(suprim�e_p);
		     p�riodicit�.add(modifi�e_p);
		     revue.add(ajout�e_r);
		     revue.add(suprim�e_r);
		     revue.add(modifi�e_r);
		     client.add(ajout�e_c);
		     client.add(suprim�e_c);
		     client.add(modifi�e_c);
		     abonnement.add(ajout�e_a);
		     abonnement.add(suprim�e_a);
		     abonnement.add(modifi�e_a);
		     
		   
		     getContentPane().setBackground(Color.white);
		     setSize(400, 300);
		     setDefaultCloseOperation(EXIT_ON_CLOSE);
		     setVisible(true);
		    
		     ajout�e_p.addActionListener(new ActionListener() {
		     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererPeriodicite(20, "'salut'");
		    	 }
		     });
		     suprim�e_p.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerPeriodicite(16);
		    	 }
		     });
		     modifi�e_p.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.ModifierPeriodicite(75,50,"'yo'",16);
		    	 }
		     });
		     ajout�e_r.addActionListener(new ActionListener() {
			     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererRevue(12345, "'aled'", "'aled'", 63, "'aled'", 200);
		    	 }
		     });
		     suprim�e_r.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerRevue(0);
		    	 }
		     });
		     modifi�e_r.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.ModifierRevue(10, 12345, 5, 200);
		    	 }
		     });
             ajout�e_c.addActionListener(new ActionListener() {
			     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererClient(5, "'Lassalle'", "'Jean'", 5, "'jsp'", 54000, "'France'", "'Terre'");
		    	 }
		     });
             suprim�e_c.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerClient(4);
		    	 }
		     });
             modifi�e_c.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.ModifierClient(4, 2, 55000, 57000);
		    	 }
		     });
             ajout�e_a.addActionListener(new ActionListener() {
			     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererAbonnement(10, "09/06/2020", "10/06/2020", 10, 20);
		    	 }
		     });
             suprim�e_a.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerAbonnement(9);
		    	 }
		     });
             modifi�e_a.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.ModifierAbonnement(2, 1);
		    	 }
		     });
             p�riodicit�.add(ajout�e_p);
             p�riodicit�.add(suprim�e_p);
             p�riodicit�.add(modifi�e_p);
             revue.add(ajout�e_r);
             revue.add(suprim�e_r);
             revue.add(modifi�e_r);
             client.add(ajout�e_c);
             client.add(suprim�e_c);
             client.add(modifi�e_c);
             abonnement.add(ajout�e_a);
             abonnement.add(suprim�e_a);
             abonnement.add(modifi�e_a);
             
=======
		   private JMenu Client = new JMenu("Client");
		   private JMenu abonnement = new JMenu("Abonnement");
		  
		   private JMenuItem ajout�e_p = new JMenuItem("ajouter");
		   private JMenuItem suprim�e_p = new JMenuItem("suprimer");
		   private JMenuItem modifi�e_p = new JMenuItem("modifier");
		   
		   private JMenuItem ajout�e_r = new JMenuItem("ajouter");
		   private JMenuItem suprim�e_r = new JMenuItem("suprimer");
		   private JMenuItem modifi�e_r = new JMenuItem("modifier");
		   
		   private JMenuItem ajout�e_c = new JMenuItem("ajouter");
		   private JMenuItem suprim�e_c = new JMenuItem("suprimer");
		   private JMenuItem modifi�e_c = new JMenuItem("modifier");
		   
		   private JMenuItem ajout�e_a = new JMenuItem("ajouter");
		   private JMenuItem suprim�e_a = new JMenuItem("suprimer");
		   private JMenuItem modifi�e_a = new JMenuItem("modifier");
		   
		   
		public Menus() {
		    super("menu gestionaire");
		     setJMenuBar(barre);
		     barre.add(p�riodicit�);
		     barre.add(revue);
		     barre.add(Client);
		     barre.add(abonnement);
		     p�riodicit�.add(ajout�e_p);
		     p�riodicit�.add(suprim�e_p);
		     p�riodicit�.add(modifi�e_p);
		     revue.add(ajout�e_r);
		     revue.add(suprim�e_r);
		     revue.add(modifi�e_r);
		     Client.add(ajout�e_c);
		     Client.add(suprim�e_c);
		     Client.add(modifi�e_c);
		     abonnement.add(ajout�e_a);
		     abonnement.add(suprim�e_a);
		     abonnement.add(modifi�e_a);
		     
		   
		     getContentPane().setBackground(Color.white);
		     setSize(400, 300);
		     setDefaultCloseOperation(EXIT_ON_CLOSE);
		     setVisible(true);
		    
		     ajout�e_p.addActionListener(new ActionListener() {
		     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererPeriodicite(20, "'salut'");
		    	 }
		     });
		     suprim�e_p.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerPeriodicite(16);
		    	 }
		     });
             p�riodicit�.add(ajout�e_p);
             p�riodicit�.add(suprim�e_p);
>>>>>>> branch 'master' of https://github.com/Made-In-Heaven-D4C-Love-Train/cpoa_td2.git
		  }

		  public static void main(String[] args) { new Menus(); }
		}

