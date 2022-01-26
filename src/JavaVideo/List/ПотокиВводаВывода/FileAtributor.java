package JavaVideo.List.ПотокиВводаВывода;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.List;
import java.util.Set;

public class FileAtributor {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp");

        System.out.println("Size: " + Files.size(path));
        System.out.println("Date modified: " + Files.getLastModifiedTime(path));
        System.out.println("File is writable: " + Files.isWritable(path));

        FileStore fileStore = Files.getFileStore(path);
        System.out.println("Type: " + fileStore.type());

        validateView(fileStore, BasicFileAttributeView.class);
        validateView(fileStore, DosFileAttributeView.class);
        validateView(fileStore, PosixFileAttributeView.class);
        validateView(fileStore, AclFileAttributeView.class);
        validateView(fileStore, UserDefinedFileAttributeView.class);
        validateView(fileStore, FileOwnerAttributeView.class);

        Class<DosFileAttributes> type = DosFileAttributes.class;
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, type);
        System.out.println("" + dosFileAttributes.isReadOnly());
        System.out.println("Creation time " + dosFileAttributes.creationTime());
        System.out.println("Is Hidden " + dosFileAttributes.isHidden());

       /* Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rwx------");
        FileAttribute<Set<PosixFilePermission>> fileAttribs = PosixFilePermissions.asFileAttribute(posixFilePermissions);
        Files.createFile(Paths.get("File1.txt"), fileAttribs); */

        UserPrincipal user = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("hp");
        AclFileAttributeView vew = Files.getFileAttributeView(path, AclFileAttributeView.class);
        AclEntry aclEntry = AclEntry.newBuilder()
                .setType(AclEntryType.ALLOW)
                .setPrincipal(user)
                .setPermissions(AclEntryPermission.READ_ATTRIBUTES, AclEntryPermission.READ_DATA).build();
        List<AclEntry> acl   = vew.getAcl();
        acl.add(aclEntry);
        vew.setAcl(acl);
    }

    private static void validateView(FileStore fs, Class<? extends FileAttributeView> viewClass) {
        boolean supports = fs.supportsFileAttributeView(viewClass);
        //System.out.println(viewClass.toString() + " " + supports);
        System.out.println("Supports " + viewClass.getSimpleName() + " - " + supports);
    }
}
