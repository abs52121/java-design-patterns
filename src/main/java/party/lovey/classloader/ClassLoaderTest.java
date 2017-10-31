package party.lovey.classloader;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileNmae = name.substring(name.lastIndexOf(".")+1) + ".class";
                InputStream is = getClass().getResourceAsStream(fileNmae);
                if (is == null) {
                    return super.loadClass(name);
                }
                try {
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

        Object instance = classLoader.loadClass("party.lovey.classloader.Bean").newInstance();
        System.out.println(instance.getClass());
        System.out.println(instance.getClass().getClassLoader());
        System.out.println(Bean.class.getClassLoader());
        System.out.println(instance instanceof  Bean);

    }
}
