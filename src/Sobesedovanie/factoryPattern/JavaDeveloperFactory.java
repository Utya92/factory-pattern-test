package Sobesedovanie.factoryPattern;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
       return new JavaDeveloper();
    }
}
