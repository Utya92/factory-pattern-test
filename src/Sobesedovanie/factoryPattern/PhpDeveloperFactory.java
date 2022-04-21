package Sobesedovanie.factoryPattern;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhPDeveloper();
    }
}
