import java.util.Iterator;

public class MyLinkedList<T> implements Myrealization<T>, MyIterators {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public MyLinkedList() {
        last = new Node<T>(null, first, null);
        first = new Node<T>(null, null, last);
    }

    @Override
    public void addLast(T e) {
        Node<T> prew = last;
        prew.setCurrentElement(e);
        last = new Node<T>(null, prew, null);
        prew.setNextElement(last);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByindex(int index) {
        try {
            index = checks(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Node<T> tNode = first.getNextElement();
        for (int i = 1; i < index; i++) {
            tNode = getNEXtelemt(tNode);
        }
        return (T) tNode.getCurrentElement();
    }

    private int checks(int index) throws Exception {
        if (index <= 0 || index > size) {
            throw new Exception();
        }
        return index;

    }


    private Node<T> getNEXtelemt(Node<T> tNode) {
        return tNode.getNextElement();
    }

    @Override
    public Iterator Iteratorrevers() {
        return new Iterator() {
            Node node = last;
            int counter=size;

            @Override
            public boolean hasNext() {
                boolean parametr = false;
                node = node.getPrewElement();

                if (counter > 0) {
                    parametr = true;
                    counter--;
                }{

                }
                return parametr;
            }

            @Override
            public T next() {
                return (T) node.currentElement;
            }
        };
    }

    @Override
    public Iterator<T> Iteratorcorrect() {

        return new Iterator() {
            Node node = first;
            int counter=0;

            @Override
            public boolean hasNext() {
                boolean parametr = false;
                node = node.getNextElement();

                if (counter < size) {
                    parametr = true;
                    counter++;
                }{

                }
                return parametr;
            }

            @Override
            public T next() {
                return (T) node.currentElement;
            }
        };
    }

    public void forect1() {
        Node node = last.getPrewElement();
        for (int j = 0; j < size; j++) {
            System.out.println(node.currentElement);
            node = node.getPrewElement();
        }
    }


    private class Node<T> {

        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prewElement;

        private Node(T currentElement, Node<T> prewElement, Node<T> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prewElement = prewElement;
        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<T> getPrewElement() {
            return prewElement;
        }

        public void setPrewElement(Node<T> prewElement) {
            this.prewElement = prewElement;
        }


    }


}
