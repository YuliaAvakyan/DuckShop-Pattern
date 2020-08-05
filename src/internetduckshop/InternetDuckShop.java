/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetduckshop;

/**
 *
 * @author Юлия
 */
public class InternetDuckShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Duck liveDuck = new LiveDuck();
            liveDuck.swim();
            liveDuck.display();
            liveDuck.performQuack();
            liveDuck.performFly();
   
        Duck model = new ModelDuck();
            model.display();
            model.setQuackBehavior(new FakeQuack());
            model.performQuack();
            model.performFly();
            model.setFlyBehavior(new RadioFly());
            model.performFly();
            
        Duck decoy = new DecoyDuck();
            decoy.display();
            decoy.performFly();
            decoy.performQuack();
            
        Duck rubduck = new RubberDuck();
            rubduck.display();
            rubduck.performFly();
            rubduck.performQuack();

	}

       
   }

