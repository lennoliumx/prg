void main() {
  String htmlString = "<html>\n" +
          "    <body>\n" +
          "        <p>Hello, world</p>\n" +
          "    </body>\n" +
          "</html>\n";

  String htmlStringDefinedAsMultiline = """
          <html>
              <body>
                  <p>Hello, world</p>
              </body>
          </html>
          """;

  System.out.println(htmlString);
  System.out.println();
  System.out.println(htmlStringDefinedAsMultiline);

  String multilineWithLongLine = """
          This is a very long string that should appear on one line. However, it is not readable very well in the IDE, if the string is not wrapped.
          This is the next line
          """;

  String multilineWithLongLineWrapped = """
          This is a very long string that should appear on one line. However, \
          it is not readable very well in the IDE, if the string is not wrapped.
          This is the next line
          """;

  System.out.println(multilineWithLongLine);
  System.out.println(multilineWithLongLineWrapped);


  String myMultiline = """
          Dies ist mein
          langer Text
          über
          mehrere Zeilen
          """;
  System.out.println(myMultiline);
}

