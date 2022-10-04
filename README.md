# cheese-sales-machine

An application for those special times when all you want is an endless stream of cheese.

This application outputs a stream of nonsense like this:

```
Farm Shop just bought 67kg of Stilton
Farm Shop just bought 46kg of Cambozola
Farm Shop just bought 54kg of Danish Blue
Marks & Spencer just bought 73kg of Camembert
Farm Shop just bought 39kg of Lanark Blue
Marks & Spencer just bought 67kg of Emmental
Farm Shop just bought 81kg of Danish Blue
Marks & Spencer just bought 6kg of Red Leicester (Unflavoured)
Farm Shop just bought 37kg of Emmental
Marks & Spencer just bought 98kg of Jarlsberg
```

## To run

The easiest way to run this application is in a container, using `docker` or `podman`:

```
podman run docker.io/monodot/cheese-machine
```

And deploy on Kubernetes:

```
kubectl -n default create deploy cheese-machine --image=docker.io/monodot/cheese-machine

kubectl -n default delete deploy/cheese-machine
```

## To compile

If you wish to run locally, then this should work:

```
mvn clean install

java -cp "target/*" xyz.tomd.cheesemachine.App
```

---



