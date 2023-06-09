package POLIPENGAYAAN;

public class App {
    public static void main(String[] args) {
        // Static Polymorphism pada class Hero dan Enemy
        Hero hero = new Hero();
        performAttack(hero); // Memanggil method performAttack() dengan objek Hero
        Enemy enemy = new Enemy();
        performAttack(enemy); // Memanggil method performAttack() dengan objek Enemy
        
        // Dynamic Polymorphism sebuah referensi dari class Character ke objek Hero, Enemy, Witch, dan Fighter
        Character character1 = new Hero();
        performAttack(character1); // Memanggil method performAttack() dengan referensi character1
        Character character2 = new Enemy();
        performAttack(character2); // Memanggil method performAttack() dengan referensi character2
        Character character3 = new Witch();
        performAttack(character3); // Memanggil method performAttack() dengan referensi character3
        Character character4 = new Fighter();
        performAttack(character4); // Memanggil method performAttack() dengan referensi character4
        
        // Dynamic Polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Character witch = new Witch();
        performAttack(witch); // Memanggil method performAttack() dengan referensi witch
        
        Fighter fighter = (Fighter) witch; // Mengubah referensi objek witch menjadi objek fighter (casting)
        performAttack(fighter); // Memanggil method performAttack() dengan referensi fighter
    }
    
    public static void performAttack(Character character) {
        character.attack(); // Memanggil method attack() pada objek yang diterima sebagai parameter
    }
}
