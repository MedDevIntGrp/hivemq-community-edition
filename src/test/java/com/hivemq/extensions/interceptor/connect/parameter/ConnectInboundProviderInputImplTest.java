/*
 * Copyright 2019-present HiveMQ GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hivemq.extensions.interceptor.connect.parameter;

import com.hivemq.extension.sdk.api.client.parameter.ClientInformation;
import com.hivemq.extension.sdk.api.client.parameter.ConnectionInformation;
import com.hivemq.extension.sdk.api.client.parameter.ServerInformation;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;

/**
 * @author Silvio Giebl
 */
public class ConnectInboundProviderInputImplTest {

    @Test
    public void constructor_and_getter() {
        final ServerInformation serverInformation = mock(ServerInformation.class);
        final ClientInformation clientInformation = mock(ClientInformation.class);
        final ConnectionInformation connectionInformation = mock(ConnectionInformation.class);

        final ConnectInboundProviderInputImpl providerInput =
                new ConnectInboundProviderInputImpl(serverInformation, clientInformation, connectionInformation);

        assertSame(serverInformation, providerInput.getServerInformation());
        assertSame(clientInformation, providerInput.getClientInformation());
        assertSame(connectionInformation, providerInput.getConnectionInformation());
    }
}