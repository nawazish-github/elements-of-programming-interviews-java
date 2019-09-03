package tree;

public class YoungestCommonAncestor {
    AncestralTree root;
    public YoungestCommonAncestor(AncestralTree root) {
        this.root = root;
    }

    public AncestralTree findYoungestCommonAncestor (AncestralTree root,
                                                     AncestralTree desendantOne,
                                                     AncestralTree descendantTwo){

        int depthOne = getDepth(desendantOne, root);
        int depthTwo = getDepth(descendantTwo, root);

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

    private int getDepth(AncestralTree descendant, AncestralTree root){
        int c = 0;
        while (descendant != root){
            descendant = descendant.node;
            ++c;
        }
        return c;
    }

    private  AncestralTree moveInTandem (AncestralTree one, AncestralTree two){
        while(one != two){
            one = one.node;
            two = two.node;
        }
        return one;
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