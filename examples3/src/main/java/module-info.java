module com.szogibalu.examples3 {

    requires com.szogibalu.serviceproviderapi;

    provides com.szogibalu.provider.ExampleProvider with com.szogibalu.examples3.Service;
}