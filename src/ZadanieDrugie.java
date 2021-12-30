import java.nio.channels.ClosedByInterruptException;

public class ZadanieDrugie {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Aplikacja zamyka się samoczynnie", "wijpe@o2.ok", 2);
        Bug bug2 = new Bug("Aplikacja przestała działać", "mizzo@o2.ok", 5);
        Bug bug3 = new Bug("Aplikacja nie reaguje", "frappe@o2.ok", 1);
        Bug bug4 = new Bug("Aplikacja zacina się", "mozibo@o2.ok", 3);

        bug1.showAllInfo();
        bug2.showAllInfo();
        bug3.showAllInfo();
        bug4.showAllInfo();

        bug1.showCreator();
        bug1.showBugStatus();
        int bug1Priority = bug1.getPriority();
        System.out.println(bug1Priority);
        bug1.status = true;
        System.out.println(bug1.status);
        System.out.println(bug2.status);
        System.out.println(bug3.status);
        System.out.println(bug4.status);
        bug4.status = true;
        System.out.println(bug1.status);
        System.out.println(bug2.status);
        System.out.println(bug3.status);
        System.out.println(bug4.status);
    }
}
