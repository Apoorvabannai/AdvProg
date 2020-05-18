package StringPractiseQuestions;

public class Manipulations {

  public static void main(String[]args){
    String paragraph = "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences," +
            " a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116)." +
            " Length and appearance do not determine whether a section in a paper is a paragraph. For instance," +
            " in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea." +
            " In this handout, we will refer to this as the “controlling idea,” because it controls what happens in the rest of the paragraph.";
    // to find the sentences in the paragraph

    String second = "This is a mind blowing ";
    String[] sentences = paragraph.split("\\.");
//    for (String pargraphCount: sentences) {
//       System.out.println(pargraphCount);
//    }
    // the Length or number of sentences in the paragraph are:
    System.out.println(" The number of sentences in the paragraph are "+ sentences.length);
    //  to find words in the paragraph
     String [] words = paragraph.split(" ");
     System.out.println(("The total number of words are "+ words.length));
     System.out.println(" The number of charecters are : "+ paragraph.length());
     System.out.println(" The number of charecters in second  are : "+ second.length());
    // to replace a word (paragraph) to seegraph
    String replacedWord = paragraph.replace("paragraph", "seegraph");
    System.out.println(replacedWord);
  }
}
