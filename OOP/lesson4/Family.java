import java.util.Arrays;

class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        this.children = newChildren;
        child.setFamily(this);
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                Human[] newChildren = new Human[children.length - 1];
                System.arraycopy(children, 0, newChildren, 0, i);
                System.arraycopy(children, i + 1, newChildren, i, children.length - i - 1);
                this.children = newChildren;
                child.setFamily(null);
                return true;
            }
        }
        return false;
    }

    public int countFamily() {
        return children.length + 2;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Family{mother=" + mother + ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet + "}";
    }
}