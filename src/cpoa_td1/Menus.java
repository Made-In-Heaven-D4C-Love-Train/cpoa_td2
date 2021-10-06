package cpoa_td1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menus extends JFrame{
	
		   private JMenuBar barre = new JMenuBar();
		   
		   private JMenu périodicité = new JMenu("Périodicité");
		   private JMenu revue = new JMenu("Revue");
<<<<<<< HEAD
		   private JMenu client = new JMenu("Client");
		   private JMenu abonnement = new JMenu("Abonnement");
		  
		   private JMenuItem ajoutée_p = new JMenuItem("ajouter");
		   private JMenuItem suprimée_p = new JMenuItem("supprimer");
		   private JMenuItem modifiée_p = new JMenuItem("modifier");
		   
		   private JMenuItem ajoutée_r = new JMenuItem("ajouter");
		   private JMenuItem suprimée_r = new JMenuItem("supprimer");
		   private JMenuItem modifiée_r = new JMenuItem("modifier");
		   
		   private JMenuItem ajoutée_c = new JMenuItem("ajouter");
		   private JMenuItem suprimée_c = new JMenuItem("supprimer");
		   private JMenuItem modifiée_c = new JMenuItem("modifier");
		   
		   private JMenuItem ajoutée_a = new JMenuItem("ajouter");
		   private JMenuItem suprimée_a = new JMenuItem("supprimer");
		   private JMenuItem modifiée_a = new JMenuItem("modifier");
		   
		   
		public Menus() {
		    super("menu gestionnaire");
		     setJMenuBar(barre);
		     barre.add(périodicité);
		     barre.add(revue);
		     barre.add(client);
		     barre.add(abonnement);
		     périodicité.add(ajoutée_p);
		     périodicité.add(suprimée_p);
		     périodicité.add(modifiée_p);
		     revue.add(ajoutée_r);
		     revue.add(suprimée_r);
		     revue.add(modifiée_r);
		     client.add(ajoutée_c);
		     client.add(suprimée_c);
		     client.add(modifiée_c);
		     abonnement.add(ajoutée_a);
		     abonnement.add(suprimée_a);
		     abonnement.add(modifiée_a);
		     
		   
		     getContentPane().setBackground(Color.white);
		     setSize(400, 300);
		     setDefaultCloseOperation(EXIT_ON_CLOSE);
		     setVisible(true);
		    
		     ajoutée_p.addActionListener(new ActionListener() {
		     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererPeriodicite(20, "'salut'");
		    	 }
		     });
		     suprimée_p.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerPeriodicite(16);
		    	 }
		     });
		     modifiée_p.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.ModifierPeriodicite(75,50,"'yo'",16);
		    	 }
		     });
		     ajoutée_r.addActionListener(new ActionListener() {
			     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererRevue(12345, "'aled'", "'aled'", 63, "'aled'", 200);
		    	 }
		     });
		     suprimée_r.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerRevue(0);
		    	 }
		     });
		     modifiée_r.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.ModifierRevue(10, 12345, 5, 200);
		    	 }
		     });
             ajoutée_c.addActionListener(new ActionListener() {
			     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererClient(5, "'Lassalle'", "'Jean'", 5, "'jsp'", 54000, "'France'", "'Terre'");
		    	 }
		     });
             suprimée_c.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerClient(4);
		    	 }
		     });
             modifiée_c.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.ModifierClient(4, 2, 55000, 57000);
		    	 }
		     });
             ajoutée_a.addActionListener(new ActionListener() {
			     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererAbonnement(10, "09/06/2020", "10/06/2020", 10, 20);
		    	 }
		     });
             suprimée_a.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerAbonnement(9);
		    	 }
		     });
             modifiée_a.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.ModifierAbonnement(2, 1);
		    	 }
		     });
             périodicité.add(ajoutée_p);
             périodicité.add(suprimée_p);
             périodicité.add(modifiée_p);
             revue.add(ajoutée_r);
             revue.add(suprimée_r);
             revue.add(modifiée_r);
             client.add(ajoutée_c);
             client.add(suprimée_c);
             client.add(modifiée_c);
             abonnement.add(ajoutée_a);
             abonnement.add(suprimée_a);
             abonnement.add(modifiée_a);
             
=======
		   private JMenu Client = new JMenu("Client");
		   private JMenu abonnement = new JMenu("Abonnement");
		  
		   private JMenuItem ajoutée_p = new JMenuItem("ajouter");
		   private JMenuItem suprimée_p = new JMenuItem("suprimer");
		   private JMenuItem modifiée_p = new JMenuItem("modifier");
		   
		   private JMenuItem ajoutée_r = new JMenuItem("ajouter");
		   private JMenuItem suprimée_r = new JMenuItem("suprimer");
		   private JMenuItem modifiée_r = new JMenuItem("modifier");
		   
		   private JMenuItem ajoutée_c = new JMenuItem("ajouter");
		   private JMenuItem suprimée_c = new JMenuItem("suprimer");
		   private JMenuItem modifiée_c = new JMenuItem("modifier");
		   
		   private JMenuItem ajoutée_a = new JMenuItem("ajouter");
		   private JMenuItem suprimée_a = new JMenuItem("suprimer");
		   private JMenuItem modifiée_a = new JMenuItem("modifier");
		   
		   
		public Menus() {
		    super("menu gestionaire");
		     setJMenuBar(barre);
		     barre.add(périodicité);
		     barre.add(revue);
		     barre.add(Client);
		     barre.add(abonnement);
		     périodicité.add(ajoutée_p);
		     périodicité.add(suprimée_p);
		     périodicité.add(modifiée_p);
		     revue.add(ajoutée_r);
		     revue.add(suprimée_r);
		     revue.add(modifiée_r);
		     Client.add(ajoutée_c);
		     Client.add(suprimée_c);
		     Client.add(modifiée_c);
		     abonnement.add(ajoutée_a);
		     abonnement.add(suprimée_a);
		     abonnement.add(modifiée_a);
		     
		   
		     getContentPane().setBackground(Color.white);
		     setSize(400, 300);
		     setDefaultCloseOperation(EXIT_ON_CLOSE);
		     setVisible(true);
		    
		     ajoutée_p.addActionListener(new ActionListener() {
		     
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.InsererPeriodicite(20, "'salut'");
		    	 }
		     });
		     suprimée_p.addActionListener(new ActionListener()	{
		    	 public void actionPerformed(ActionEvent e) {
		    		 td1 td = new td1();
		    		 td.SupprimerPeriodicite(16);
		    	 }
		     });
             périodicité.add(ajoutée_p);
             périodicité.add(suprimée_p);
>>>>>>> branch 'master' of https://github.com/Made-In-Heaven-D4C-Love-Train/cpoa_td2.git
		  }

		  public static void main(String[] args) { new Menus(); }
		}

