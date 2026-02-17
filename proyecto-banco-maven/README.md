
# Proyecto Banco — Práctica de Javadoc (JDK + Maven)

## Estructura
- `src/main/java/com/miempresa/banco` → código fuente
- `pom.xml` → build Maven con plugin de Javadoc

## Tareas
1. Añade Javadoc a clases, atributos relevantes y métodos públicos.
2. Genera la documentación con Maven y/o JDK.

## Comandos Maven
- Generar Javadoc HTML: `mvn -q javadoc:javadoc` → `target/site/apidocs/index.html`
- Generar sitio: `mvn -q site` → `target/site/index.html`
- Generar javadoc.jar: `mvn -q javadoc:jar` → `target/*-javadoc.jar`

## Comando JDK (opcional)
```
javadoc -d docs -sourcepath src/main/java -subpackages com.miempresa.banco         -encoding UTF-8 -docencoding UTF-8 -charset UTF-8
```
Abre `docs/index.html`.

## Notas
- Cambia `-Xdoclint:none` por `-Xdoclint:all` y activa `failOnError` si quieres evaluación estricta.
