package pranav.java15;

public class TextBlocks {

    public static void main(String[] args) {
        System.out.println(
                """
                        <!DOCTYPE html>
                        <html>
                            <head>
                                <title>Example</title>
                            </head>
                            <body>
                                <p>This is an example of a simple HTML 
                                page with one paragraph.</p>
                            </body>
                        </html>      
                        """
        );

        System.out.println(
                """
                        {
                            "firstName": "Pranav",
                            "lastName": "Pagote"
                        }
                        """
        );
    }
}
