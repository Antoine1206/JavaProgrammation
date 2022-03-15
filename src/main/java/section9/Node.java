package section9;

import java.util.ArrayList;

public class Node extends ListItem {


    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem testRightLink) {
        rightLink = testRightLink;
        return rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem testLeftLink) {
        leftLink = testLeftLink;
        return leftLink;
    }

    @Override
    public int compareTo(ListItem listeItem) {
        if (listeItem != null) {
            return ((String) super.getValue()).compareTo((String) listeItem.getValue());
        } else {
            return -1;
        }
    }

    public Node(Object value) {
        super(value);
    }


}
