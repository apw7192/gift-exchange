package exchange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Assigner {

    public static final Random RNG = new Random();

    public static Map<Person, Person> assignGifters(List<Person> givers) throws Exception {

        List<Person> receivers;
        if (givers instanceof ArrayList) {
            receivers = new ArrayList<>(givers);
        }
        else if (givers instanceof LinkedList) {
            receivers = new LinkedList<>(givers);
        }
        else {
            throw new Exception("Givers should be instance of Array or LinkedList");
        }


        int giverIndex = 0;
        Person currentGiver = givers.get(giverIndex);
        HashMap<Person, Person> assignments = new HashMap<>();

        while (true) {
            int receiverIndex = RNG.nextInt(receivers.size());
            Person currentReceiver = receivers.get(receiverIndex);
            if (!(currentReceiver.getFamilyName().equals(currentGiver.getFamilyName()))) {
                assignments.put(currentGiver, currentReceiver);
                receivers.remove(receiverIndex);
                if (receivers.isEmpty())
                    break;
                giverIndex++;
                currentGiver = givers.get(giverIndex);
            }
        }

        return assignments;
    }
}
