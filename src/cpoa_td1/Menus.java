package cpoa_td1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menus extends JFrame{
	
		   private JMenuBar barre = new JMenuBar();
		   
		   private JMenu p�riodicit� = new JMenu("P�riodicit�");
		   private JMenu revue = new JMenu("Revue");
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
		  }

		  public static void main(String[] args) { new Menus(); }
		}

