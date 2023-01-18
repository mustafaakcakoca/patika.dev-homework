public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

Fighter(String name, int damage, int health, int weight){
    this.name=name;
    this.damage=damage;
    this.health=health;
    this.weight=weight;
}

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hit damage.");
        if (foe.isDodge()){
            System.out.println(foe.name + " Dodge the punch");
            System.out.println("-----------------");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;

    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}