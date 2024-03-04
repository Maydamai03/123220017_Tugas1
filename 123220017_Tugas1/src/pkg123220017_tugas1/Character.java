/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220017_tugas1;

/**
 *
 * @author ASUS
 */
public abstract class Character implements Attackable {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    @Override
    public void basicAttack() {
        System.out.println(name + " menggunakan serangan biasa");
    }

    @Override
    public void specialAttack() {
        System.out.println(name + " menggunakan serangan spesial!!");
    }

    @Override
    public void ultimateAttack() {
        System.out.println(name + " menggunakan ULTIMATE!!!");
    }
}

