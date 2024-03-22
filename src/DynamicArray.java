// Dynamic Arrays
public class DynamicArray {
    int size;
    int capacity;
    Object[] array;

    public DynamicArray () {
        this.capacity = 10;
        array = new Object[this.capacity];
    }

    public DynamicArray (int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public void add (Object item) {
        if (size >= capacity) {
            grow();
        }

        array[size] = item;
        size++;

    }

    public void insert (Object item) {
        if (size >= capacity) {
            grow();
        }

        array[size] = item;
        size++;

    }

    public void insert (Object item, int index) {
        if (size >= capacity) {
            grow();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }

        array[index] = item;
        size++;

    }


    public boolean contains (Object item) {
        return indexOf(item) != -1;
    }

    public int indexOf (Object item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public boolean delete (Object item) {
        if (!contains(item)) {
            return false;
        }
            for (int i = 0; i < size; i++) {
                if(array[i] == item) {
                    for (int j = 0; j < (size-i-1); j++) {
                        array[i+j] = array[i+j+1];
                    }

                    array[size-1] = null;
                    size--;

                    if (size <= (int) (capacity / 3)) {
                        shrink();
                    }

                    break;
                }
            }

        return true;
    }

    private void grow () {
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        capacity = newCapacity;
    }

    private void shrink () {
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        capacity = newCapacity;
    }

    public boolean isEmpty () {
        return size == 0;
    }

    public String toString () {
        String str = "";

        for (int i = 0; i < capacity; i++) {
            str += array[i];
            str += ", ";
        }

        str = str.substring(0, str.length() - 2);
        return "[" + str + "]";
    }
}

