// "Replace with enhanced 'switch' statement" "true"
import java.util.*;

class SwitchExpressionMigration {
  private static int m(int x) {
    switch<caret> (x) {
      case 1: {
        if (true) return 0;
        else return 1;
      }
      case 2:
        return 2;
      case 3, 4: {
        System.out.println("asda");
        return 3;
      }
      default:
        return 12;
    }
  }
}