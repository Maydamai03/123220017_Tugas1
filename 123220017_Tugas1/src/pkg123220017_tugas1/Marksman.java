/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220017_tugas1;

/**
 *
 * @author ASUS
 */
public class Marksman extends Character {
    public Marksman(String name, int health) {
        super(name, health);
    }

    @Override
    public void specialAttack() {
        System.out.println(getName() + " menembakkan peluru nuklir");
    }
}