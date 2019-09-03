package tree;

public class YoungestCommonAncestor {
    AncestralTree root;
    public YoungestCommonAncestor(AncestralTree root) {
        this.root = root;
    }

    public AncestralTree findYoungestCommonAncestor (AncestralTree root,
                                                     AncestralTree desendantOne,
                                                     AncestralTree descendantTwo){

        int depthOne = getDepth(desendantOne);
        int depthTwo = getDepth(descendantTwo);

        if (depthTwo > depthOne){
            for (int i =1; i<=(depthTwo-depthOne); i++){
                descendantTwo = descendantTwo.node;
            }
        }else{
            for (int i =1; i<=(depthOne-depthTwo); i++){
                desendantOne = desendantOne.node;
            }
        }

        return moveInTandem(desendantOne, descendantTwo);
    }

    private int getDepth(AncestralTree descendant){
        AncestralTree temp = descendant;
        int c = 0;
        while (temp != null){
            temp = temp.node;
            ++c;
        }
        return c-1;
    }

    private  AncestralTree moveInTandem (AncestralTree one, AncestralTree two){
        while(one != null || two != null){
            if (one.name == two.name)
                return one;
            else
                one = one.node;
                two = two.node;
        }
        return null;
    }
}


class AncestralTree {
    public char name;
    public AncestralTree node;

    AncestralTree(char name, AncestralTree node) {
        this.name = name;
        this.node = node;
    }
}