---
description: This is a guide to create ingestion bot service account.
---

# Create Service Account

## Step 1: Enable Client-Credential

* Go to your project dashboard.

![](<../../../.gitbook/assets/image (23) (1) (1) (1) (3) (1) (7).png>)

* Navigate to `Applications > Applications`

![](<../../../.gitbook/assets/image (78) (1) (1) (3) (1) (4).png>)

* Select your application from the list.

![](<../../../docs/.gitbook/assets/image (77).png>)

* Once selected, scroll down until you see the `Application Properties` section.
* Change the `Token Endpoint Authentication Method` from None to Basic.

![](<../../../docs/.gitbook/assets/image (40).png>)

* Now scroll further down to the section on `Advanced Settings`.
* Click on it and select `Grant Types`.
* In the `Grant Types`, check the option for `Client Credentials`.

![](<../../../docs/.gitbook/assets/image (46).png>)

* Once done, click on `Save Changes`.

## Step 2: Authorize the API with our Application.

* Navigate to `Applications > APIs` from the left menu.

![](<../../../docs/.gitbook/assets/image (10).png>)

* You will see the `Auth0 Management API`.

![](<../../../docs/.gitbook/assets/image (32) (2) (1) (1).png>)

* Click on the `Auth0 Management API`.

![](<../../../docs/.gitbook/assets/image (62).png>)

* Click on the `Machine to Machine Applications` tab.
* You will find your application listed below.

![](<../../../docs/.gitbook/assets/image (28).png>)

* Click on the toggle to authorize.
* Once done you will find a down arrow, click on it.

![](<../../../docs/.gitbook/assets/image (82).png>)

* Select the permissions (scopes) that should be granted to the client.
* Click on `Update`.

![](<../../../docs/.gitbook/assets/image (51).png>)
