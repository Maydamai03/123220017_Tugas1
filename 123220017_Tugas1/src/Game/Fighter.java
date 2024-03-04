/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

/**
 *
 * @author ASUS
 */
public class Fighter extends Character {
    public Fighter(String name, int health) {
        super(name, health);
    }

    @Override
    public void specialAttack() {
        System.out.println(getName() + " menebaskan pedang keadilan!");
    }
}
