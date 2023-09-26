package bg.softuni.fundamentals.finalExamPreparationTwo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
            /*
2
Solmyr 85 120
Kyrre 99 50
Heal - Solmyr - 10
Recharge - Solmyr - 50
TakeDamage - Kyrre - 66 - Orc
CastSpell - Kyrre - 15 - ViewEarth
End
             */

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> heroHitPointsMap = new LinkedHashMap<>();
        Map<String, Integer> heroManaPointsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] heroData = scanner.nextLine().split("\\s+");
            String heroName = heroData[0];
            int hitPoints = Integer.parseInt(heroData[1]);
            int manaPoints = Integer.parseInt(heroData[2]);

            if (hitPoints <= 100) {
                heroHitPointsMap.put(heroName, hitPoints);
            }
            if (manaPoints <= 200) {
                heroManaPointsMap.put(heroName, manaPoints);
            }

        }
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] commands = input.split("\\s+\\-\\s+");
            //CastSpell
            //TakeDamage
            //Recharge
            //Heal
            String actions = commands[0];
            String heroName = commands[1];
            switch (actions) {
                case "CastSpell":
                    int requiredMana = Integer.parseInt(commands[2]);
                    int currentMana = heroManaPointsMap.get(heroName);
                    String spell = commands[3];
                    //"{hero name} has successfully cast {spell name} and now has {mana points
                    //left} MP!"
                    /*
                    Kyrre has successfully cast ViewEarth and now has
                    35 MP!
                     */
                    if(requiredMana <= currentMana){
                        heroManaPointsMap.put(heroName, (currentMana - requiredMana));
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                              heroName, spell, heroManaPointsMap.get(heroName) );
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spell);
                    }
                    break;
                case "TakeDamage":
                    /*
                    TakeDamage - Kyrre - 66 - Orc
                    {hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
                    Tyris has been killed by Fireball!
                     */
                    int currentHitPoints = heroHitPointsMap.get(heroName);
                    int damage = Integer.parseInt(commands[2]);
                    String attacker = commands[3];
                    heroHitPointsMap.put(heroName, (currentHitPoints - damage));
                    if(heroHitPointsMap.get(heroName) < 0){
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                        heroHitPointsMap.remove(heroName);
                    }else{
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                                heroName,damage,attacker,heroHitPointsMap.get(heroName));
                    }
                    int x = 1;

                    break;
                case "Recharge":

                    break;
                case "Heal":
                    break;
            }
            int x = 1;


            input = scanner.nextLine();
        }


    }
}
