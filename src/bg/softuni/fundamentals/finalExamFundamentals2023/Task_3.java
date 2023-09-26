package bg.softuni.fundamentals.finalExamFundamentals2023;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> followersAndLikes = new LinkedHashMap<>();
        Map<String, Integer> followersAndComments = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while(!"Log out".equals(input)){
            String[] commands = input.split(":\\s+");
            String action = commands[0];
            String name = commands[1];
            switch (action){
                case "New follower":
                    if(!followersAndLikes.containsKey(name) && !followersAndComments.containsKey(name)){
                        followersAndLikes.put(name, 0);
                        followersAndComments.put(name, 0);
                    }
                    break;
                case "Like":
                    int likesCount = Integer.parseInt(commands[2]);
                    if(!followersAndLikes.containsKey(name) && !followersAndComments.containsKey(name)){
                        followersAndLikes.put(name, likesCount);
                        followersAndComments.put(name, 0);
                    }else{
                        int currentLikes = followersAndLikes.get(name);
                        followersAndLikes.put(name, (currentLikes + likesCount));
                    }
                    break;
                case "Comment":
                    if(!followersAndComments.containsKey(name) && !followersAndLikes.containsKey(name)){
                        followersAndComments.put(name, 1);
                        followersAndLikes.put(name, 0);
                    }else{
                        int currentComments = followersAndComments.get(name);
                        followersAndComments.put(name, (currentComments + 1));
                    }
                    break;
                case "Blocked":
                    if(!followersAndLikes.containsKey(name) && !followersAndComments.containsKey(name)){
                        System.out.println(name + " doesn't exist.");
                    }else {
                        followersAndLikes.remove(name);
                        followersAndComments.remove(name);
                    }
                    break;
            }



            input = scanner.nextLine();
        }
        System.out.printf("%d followers\n",followersAndLikes.size());
        for (Map.Entry<String, Integer> entry : followersAndLikes.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(),(entry.getValue() + followersAndComments.get(entry.getKey())));
        }


    }
}
