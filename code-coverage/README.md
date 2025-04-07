# Code Coverage con JaCoCo

Per eseguire tutti i test:

```text
mvn test
```

Per eseguire solo i test di una classe:
```text
mvn test -Dtest=TestStr
```

Per eseguire un solo metodo di test:
```text
mvn test -Dtest=TestStr#shouldGiveOkWhenBothTrue
```

Per selezionare più di un test della stessa classe:

```text
mvn test -Dtest=TestStr#shouldGiveOkWhenBothTrue+shouldGiveKoWhenBothFalse
```

Si possono usare anche dei pattern:
```text
mvn test -Dtest=TestStr#shouldGive*WhenBoth*
```

Per maggiori dettagli: https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html