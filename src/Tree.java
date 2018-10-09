public class Tree {

    private String nameOfTree;
    private int numberOfLeaves;
    public int numberOfTrees;

    public void setNameOfTree(String nameOfTree){this.nameOfTree = nameOfTree;};
    public String getNameOfTree(){return nameOfTree;};

    public void setNumberOfLeaves(int numberOfLeaves){this.numberOfLeaves = numberOfLeaves;};
    public int getNumberOfLeaves(){return numberOfLeaves;};

    public int getNumberOfTrees(){return numberOfTrees;};

    public Tree()
    {
        this.nameOfTree = "No name";
        this.numberOfLeaves = 0;
    }

    public Tree(String nameOfTree, int numberOfLeaves)
    {
        setNameOfTree(nameOfTree);
        setNumberOfLeaves(numberOfLeaves);
    }

    public String toString()
    {
        return "\nThe name of the tree: " + getNameOfTree() + "\nThe number of leaves: " + getNumberOfLeaves();
    }



}
