package code23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFiles {

  static void listRecursively(Path path) throws IOException {
    System.out.println(path);
    if (Files.isDirectory(path)) {
      for (Path child : list(path)) {
        listRecursively(child);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    Path start = Paths.get("./filestructure");
    listRecursively(start);
//        for (Path path : list(start)) {
//            System.out.println(path);
//            if (Files.isDirectory(path)) {
//                Path[] subpaths = list(path);
//                for (Path subpath : subpaths) {
//                    System.out.println(subpath);
//                    if (Files.isDirectory(subpath)) {
//                        Path[] subsubpaths = list(subpath);
//                        for (Path subsubpath : subsubpaths) {
//                            System.out.println(subsubpath);
//                        }
//                    }
//                }
//            }
//        }
  }

  /**
   * This method returns an array with all files and sub-directories of path
   */
  private static Path[] list(Path path) throws IOException {
    return Files.list(path)
            .toArray(Path[]::new);
  }
}
