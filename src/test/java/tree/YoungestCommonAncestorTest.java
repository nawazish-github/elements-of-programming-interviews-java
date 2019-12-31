package tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class YoungestCommonAncestorTest {

    static YoungestCommonAncestor youngestCommonAncestor;
    static AncestralTree ancestralTreeA;
    static AncestralTree ancestralTreeB;
    static AncestralTree ancestralTreeC;
    static AncestralTree ancestralTreeD;
    static AncestralTree ancestralTreeE;
    static AncestralTree ancestralTreeF;
    static AncestralTree ancestralTreeG;
    static AncestralTree ancestralTreeH;
    static AncestralTree ancestralTreeI;

    @BeforeAll
    public static void initializeDescendantTree (){
        ancestralTreeA = new AncestralTree('A', null);
         ancestralTreeB = new AncestralTree('B', ancestralTreeA);
         ancestralTreeC = new AncestralTree('C', ancestralTreeA);
         ancestralTreeD = new AncestralTree('D', ancestralTreeB);
         ancestralTreeE = new AncestralTree('E', ancestralTreeB);
         ancestralTreeF = new AncestralTree('F', ancestralTreeC);
         ancestralTreeG = new AncestralTree('G', ancestralTreeC);
         ancestralTreeH = new AncestralTree('H', ancestralTreeD);
         ancestralTreeI = new AncestralTree('I', ancestralTreeD);
        youngestCommonAncestor = new YoungestCommonAncestor(ancestralTreeA);
    }

    @Test
    public void testYoungestCommonAncestor(){
        AncestralTree youngestCommonAncestor = this.youngestCommonAncestor.findYoungestCommonAncestor(ancestralTreeA, ancestralTreeE, ancestralTreeI);
        Assertions.assertEquals('B', youngestCommonAncestor.name);
    }
}
