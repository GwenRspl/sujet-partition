# Sujet Partition

## Présentation

Sujet-partition est une librairie comprenant la méthode partition qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.  

## Installation

### Via Jar  

**IntelliJ IDEA**  
File > Project Structure > Librairies > New Project Library > Java  
Puis sélectionnez *sujet-partition-1.0-SNAPSHOT.jar*
 
**Eclipse**  
Clic droit sur votre projet > Build Path > Configure Build Path > Libraries > Add External JARs  
Puis sélectionnez *sujet-partition-1.0-SNAPSHOT.jar*

 
### Via Maven
Ajoutez la dépendance au pom.xml de votre projet:
```xml
<dependency>
    <groupId>fr.gwenrspl</groupId>
    <artifactId>sujet-partition</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
Puis ajouter le module à votre projet:  

**IntelliJ IDEA**   
File > Project Structure > Modules > Add > Import module, puis sélectionnez le projet *sujet-partition*

## Utilisation
Une fois la librairie importée dans votre projet, vous pouvez l'utiliser comme suit:  
```java
import fr.gwenrspl.PartitionUtil;

public class VotreClasse {
    List<List<Integer>> actualList = PartitionUtil.partition(Arrays.asList(1, 2, 3, 4, 5), 1);
}
```
