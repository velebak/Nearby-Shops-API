package org.nearbyshops.RESTEndpoints.RESTEndpointRoles.Deprecated;

import okhttp3.OkHttpClient;
import org.nearbyshops.DAOs.DAORoles.DAOLoginUsingOTP;
import org.nearbyshops.DAOs.DAORoles.DAOPhoneVerificationCodes;
import org.nearbyshops.DAOs.DAORoles.DAOUserNew;
import org.nearbyshops.Globals.Globals;


//@Path("/api/v1/User/LoginGlobal")
public class LoginGlobalRESTEndpoint {


    private DAOUserNew daoUser = Globals.daoUserNew;
    private DAOLoginUsingOTP daoLoginUsingOTP = new DAOLoginUsingOTP();
    private DAOPhoneVerificationCodes daoPhoneVerificationCodes = Globals.daoPhoneVerificationCodes;


    private static final String AUTHENTICATION_SCHEME = "Basic";

    private final OkHttpClient client = new OkHttpClient();



//    @Path("/GetProfileWithLogin")







//
//    @GET
//    @Path("/LoginUsingGlobalCredentials/{ServiceURLSDS}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getProfileWithLogin(
//            @HeaderParam("Authorization")String headerParam,
//            @PathParam("ServiceURLSDS")String serviceURLForSDS) throws IOException
//
//    {
//
//
//        System.out.println("Login using global credentials !");
//
//
//
//        final String encodedUserPassword = headerParam.replaceFirst(AUTHENTICATION_SCHEME + " ", "");
//
//        //Decode username and password
//        String usernameAndPassword = new String(Base64.getDecoder().decode(encodedUserPassword.getBytes()));
//
//        //Split username and password tokens
//        final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
//        final String phone = tokenizer.nextToken();
//        final String password = tokenizer.nextToken();
//
//        //Verifying Username and password
////        System.out.println(username);
////        System.out.println(password);
//
//
////            try {
////                Thread.sleep(3000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//
//
//
//
//        String credentials = Credentials.basic(phone, password);
//
//
//        Request request = new Request.Builder()
//                .url(serviceURLForSDS + "/api/v1/User/LoginGlobal/VerifyCredentials")
//                .header("Authorization", credentials)
//                .build();
//
//
//
//
//        try (okhttp3.Response response = client.newCall(request).execute()) {
//
//            if (!response.isSuccessful())
//            {
//                return Response.status(Response.Status.BAD_REQUEST)
//                        .build();
//            }
//
//
//            Headers responseHeaders = response.headers();
//            for (int i = 0; i < responseHeaders.size(); i++) {
//                System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
//            }
//
//
//            System.out.println(response.body().string());
//        }
//
//
//
//
//
//
//
//        String generatedPassword = new BigInteger(130, Globals.random).toString(32);
//
//
//        User user = new User();
//        user.setPassword(generatedPassword);
//        user.setPhone(phone);
//
//
//
//        int rowsUpdated = daoLoginUsingOTP.upsertUserProfile(user,true);
//
//
//
//        // get profile information and send it to user
//        User userProfile = daoUser.getProfile(phone,generatedPassword);
//        userProfile.setPassword(generatedPassword);
//        userProfile.setPhone(phone);
//
//
//
//
//        if(rowsUpdated==1)
//        {
//
//
//
////                SendSMS.sendSMS("You are logged in successfully !",
////                        user.getPhone());
//
//            return Response.status(Response.Status.OK)
//                    .entity(userProfile)
//                    .build();
//        }
//        else
//        {
//            return Response.status(Response.Status.NO_CONTENT)
//                    .build();
//        }
//
//
//
//    }




//
//
//
//
//
//    @GET
//    @Path("/LoginUsingGlobal/{ServiceURLSDS}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getProfileWith(
//            @HeaderParam("Authorization")String headerParam,
//            @PathParam("ServiceURLSDS")String serviceURLForSDS)
//
//    {
//
//
//        System.out.println("Login using global ... dummy method ... credentials !");
//
//
//
//        final String encodedUserPassword = headerParam.replaceFirst(AUTHENTICATION_SCHEME + " ", "");
//
//        //Decode username and password
//        String usernameAndPassword = new String(Base64.getDecoder().decode(encodedUserPassword.getBytes()));
//
//        //Split username and password tokens
//        final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
//        final String phone = tokenizer.nextToken();
//        final String password = tokenizer.nextToken();
//
//        //Verifying Username and password
////        System.out.println(username);
////        System.out.println(password);
//
//
////            try {
////                Thread.sleep(3000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//
//
//
//
//        String credentials = Credentials.basic(phone, password);
//
//
//        Request request = new Request.Builder()
//                .url(serviceURLForSDS + "/api/v1/User/LoginGlobal/VerifyCredentials")
//                .header("Authorization", credentials)
//                .build();
//
//
//
//
//
//
////        try (okhttp3.Response response = client.newCall(request).execute()) {
////
////            if (!response.isSuccessful())
////            {
////                return Response.status(Response.Status.BAD_REQUEST)
////                        .build();
////            }
////
////
////            Headers responseHeaders = response.headers();
////            for (int i = 0; i < responseHeaders.size(); i++) {
////                System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
////            }
////
////
////            System.out.println(response.body().string());
////        }
//
//
//
//
//
//
//
//        String generatedPassword = new BigInteger(130, Globals.random).toString(32);
//
//
//        User user = new User();
//        user.setPassword(generatedPassword);
//        user.setPhone(phone);
//
//
//
//        int rowsUpdated = daoLoginUsingOTP.upsertUserProfile(user,true);
//
//
//
//        // get profile information and send it to user
//        User userProfile = daoUser.getProfile(phone,generatedPassword);
//        userProfile.setPassword(generatedPassword);
//        userProfile.setPhone(phone);
//
//
//
//
//        if(rowsUpdated==1)
//        {
//
//
//
////                SendSMS.sendSMS("You are logged in successfully !",
////                        user.getPhone());
//
//            return Response.status(Response.Status.OK)
//                    .entity(userProfile)
//                    .build();
//        }
//        else
//        {
//            return Response.status(Response.Status.NO_CONTENT)
//                    .build();
//        }
//
//
//
//    }
//




//
//    public void run() throws Exception {
//        Request request = new Request.Builder()
//                .url("https://publicobject.com/helloworld.txt")
//                .build();
//
//
//        try (okhttp3.Response response = client.newCall(request).execute()) {
//
//            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
//
//            Headers responseHeaders = response.headers();
//            for (int i = 0; i < responseHeaders.size(); i++) {
//                System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
//            }
//
//            System.out.println(response.body().string());
//        }
//    }



}
