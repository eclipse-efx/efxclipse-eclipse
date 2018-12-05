# Eclipse Tooling for JavaFX

## How to build

To build this tooling run the following command from the root of the repository.

```
mvn clean verify
```

The master pom is only a pointer to the `efxclipse-eclipse/releng/pom.xml` which contains the full build configuration.

After a successful build you find  the update site to install the tooling in the `releng\org.eclipse.fx.ide.updatesite\target\site` folder.

