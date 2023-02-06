package com.myorg;

import software.amazon.awscdk.App;

public class CursoAwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        VpcStack vpc = new VpcStack(app, "Vpc");
        ClusterStack clusterStack = new ClusterStack(app, "Cluster", vpc.getVpc());
        clusterStack.addDependency(vpc); // como o cluster depende da criação da VPC, precisamos setar isso no cdk


        app.synth();
    }
}

