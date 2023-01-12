package Transport;

public class CantDiagnosisException extends Exception {

        public Transport transport;

        public CantDiagnosisException (String message) {
            super ( message );
            this.transport = transport;
        }
    }

