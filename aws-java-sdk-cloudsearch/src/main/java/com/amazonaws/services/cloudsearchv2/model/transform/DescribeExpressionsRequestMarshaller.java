/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudsearchv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeExpressionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExpressionsRequestMarshaller implements Marshaller<Request<DescribeExpressionsRequest>, DescribeExpressionsRequest> {

    public Request<DescribeExpressionsRequest> marshall(DescribeExpressionsRequest describeExpressionsRequest) {

        if (describeExpressionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeExpressionsRequest> request = new DefaultRequest<DescribeExpressionsRequest>(describeExpressionsRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DescribeExpressions");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeExpressionsRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(describeExpressionsRequest.getDomainName()));
        }

        com.amazonaws.internal.SdkInternalList<String> expressionNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeExpressionsRequest
                .getExpressionNames();
        if (!expressionNamesList.isEmpty() || !expressionNamesList.isAutoConstruct()) {
            int expressionNamesListIndex = 1;

            for (String expressionNamesListValue : expressionNamesList) {
                if (expressionNamesListValue != null) {
                    request.addParameter("ExpressionNames.member." + expressionNamesListIndex, StringUtils.fromString(expressionNamesListValue));
                }
                expressionNamesListIndex++;
            }
        }

        if (describeExpressionsRequest.getDeployed() != null) {
            request.addParameter("Deployed", StringUtils.fromBoolean(describeExpressionsRequest.getDeployed()));
        }

        return request;
    }

}
