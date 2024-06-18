    FirebaseFirestore firestore = FirebaseFirestore.getInstance();
    CollectionReference cities = firestore.collection("cities");
    ApiFuture<WriteResult> future = cities.document("SF").set(data);
    // future.get() blocks on response
    System.out.println("Update time : " + future.get().getUpdateTime());  
