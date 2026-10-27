### 1. Abstract Factory

- **Contexte** : ton application doit tourner sur AWS, GCP et Azure. Pour chaque cloud, il faut créer ensemble un client de stockage, un client de file de messages et un client de secrets, qui doivent rester cohérents entre eux (pas de stockage AWS avec une file GCP). Le code métier ne doit jamais mentionner un fournisseur.
- **Objectif** : fournir une interface de fabrique par fournisseur, avec des produits compatibles, sans que le domaine connaisse les classes concrètes.
- **Contraintes** : aucun `if provider` dans le code métier ; ajouter un fournisseur ne doit pas modifier le client ; les produits d'une même famille doivent être créés ensemble ; les dépendances doivent rester injectables pour les tests.
- **Livrable** : interfaces des produits, fabrique abstraite, trois fabriques concrètes, un exemple de code métier et des tests qui remplacent un fournisseur par configuration.
- **Critères** : le même scénario fonctionne sur les trois clouds ; aucun type concret de SDK dans le domaine ; une famille incohérente est impossible à construire par erreur.
- **À pratiquer** : distinguer Abstract Factory de Factory Method, et repérer quand une famille de produits justifie la complexité.


### 2. Two Sum (LeetCode id: 1)

- **Énoncé** : étant donné un tableau d'entiers `nums` et un entier `target`, retourne les indices des deux éléments dont la somme vaut `target`. Chaque entrée a exactement une solution, et un même élément ne peut pas être utilisé deux fois.
- **Exemple** : `nums = [2, 7, 11, 15]`, `target = 9` → `[0, 1]`.
- **Contraintes** : `2 <= nums.length <= 10^4`, valeurs comprises entre `-10^9` et `10^9`, une seule solution.

